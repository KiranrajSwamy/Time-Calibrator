

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
 * Servlet implementation class ForgotPassword
 */
@WebServlet("/ForgotPassword")
public class ForgotPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ForgotPassword() {
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
      		HttpSession session=request.getSession(true);			
      		DB Db=new DB();
			 Db.loadDriver();
			 Db.getConnection();
      		session.setAttribute("DB",Db);		    
	    	response.setContentType("text/html");
	    	String lname=request.getParameter("lname");			
	    	ResultSet rs1=Db.select("select Sec_Q from User where Lname='"+lname+"'");
	    	if(rs1==null)
	    	{
	    	//	JOptionPane.showMessageDialog(null,"UserName invalid");
	    	//	response.sendRedirect("JspPages/forgotpassword.jsp");
	    		out.println ("<script type=\"text/javascript\">");
				out.println("alert('Login-name Invalid');");
				out.println("location='JspPages/forgotpassword.jsp'; ");
				out.println("</script>");
		   
	    	}
	    	else
	    	{			
	    		rs1.next();
	    		session.setAttribute("sec_q",rs1.getString(1));
	    		session.setAttribute("lname",lname);
	    		response.sendRedirect("JspPages/showquestion.jsp");
	    	}
		}
		
		catch(Exception e)
	    {
	   // 	JOptionPane.showMessageDialog(null,"Login name invalid");
	    //	response.sendRedirect("JspPages/forgotpassword.jsp");
	    	out.println ("<script type=\"text/javascript\">");
			out.println("alert('Login-name Invalid');");
			out.println("location='JspPages/forgotpassword.jsp'; ");
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
