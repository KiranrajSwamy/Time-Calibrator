

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import DB.DB;

/**
 * Servlet implementation class ChangePassword
 */
@WebServlet("/ChangePassword")
public class ChangePassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChangePassword() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();			

		try
		{
	
			HttpSession session=request.getSession(false);			
			DB Db=(DB)session.getAttribute("DB");
			 Db.loadDriver();
			 Db.getConnection();
			response.setContentType("text/html");
			int uid=(Integer)session.getAttribute("uid");
			String oldpassword=request.getParameter("oldpassword");
			String newpassword=request.getParameter("newpassword");  
			String cpassword=request.getParameter("cpassword");        

		    ResultSet rs=Db.select("select * from User where Lpassword='"+oldpassword+"' and Uid="+uid);
			if(rs==null)
			{
				//JOptionPane.showMessageDialog(null,"Current password incorrect");
		    //	response.sendRedirect("JspPages/changepassword.jsp");
		    	out.println ("<script type=\"text/javascript\">");
				out.println("alert('Current password incorrect!');");
				out.println("location='JspPages/changepassword.jsp'; ");
				out.println("</script>");
			}
			else
			{	rs.next();
				//System.out.println(rs.getString("Lpassword"));
				int rowsAffected=Db.insertRecord("update User set Lpassword='"+newpassword+"'where Uid="+uid);
				if(rowsAffected>0)
				{
	    	 //   JOptionPane.showMessageDialog(null,"Password changed succesfully!!!!!!!!");		    
	    	  //  response.sendRedirect("JspPages/login.jsp");
	    	    out.println ("<script type=\"text/javascript\">");
				out.println("alert('Password changed succesfully!! Login Again');");
				out.println("location='JspPages/login.jsp'; ");
				out.println("</script>");
				}
				else
				{
					//JOptionPane.showMessageDialog(null,"password changing failed");		    
					//response.sendRedirect("JspPages/changepassword.jsp");
					out.println ("<script type=\"text/javascript\">");
					out.println("alert('password changing failed! Retry');");
					out.println("location='JspPages/changepassword.jsp'; ");
					out.println("</script>");
				}
			}
		}
		catch(Exception e)
		{
			//JOptionPane.showMessageDialog(null,"enter valid current password");		    
			//response.sendRedirect("JspPages/changepassword.jsp");
			out.println ("<script type=\"text/javascript\">");
			out.println("alert('password changing failed! Retry');");
			out.println("location='JspPages/changepassword.jsp'; ");
			out.println("</script>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
