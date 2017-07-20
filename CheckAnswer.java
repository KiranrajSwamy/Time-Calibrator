

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
 * Servlet implementation class CheckAnswer
 */
@WebServlet("/CheckAnswer")
public class CheckAnswer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckAnswer() {
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
			String sec_a=request.getParameter("sec_a");
			String lname=(String)session.getAttribute("lname");
			ResultSet rs1=Db.select("select Lpassword,Email from User where Sec_A='"+sec_a+"'and Lname='"+lname+"'");
			if(rs1==null)
			{		
			    	//JOptionPane.showMessageDialog(null,"Ans is wrong");
			    	//response.sendRedirect("JspPages/showquestion.jsp");
			    	out.println ("<script type=\"text/javascript\">");
					out.println("alert('Security Answer is Wrong!');");
					out.println("location='JspPages/showquestion.jsp'; ");
					out.println("</script>");
			}
			else
			{			
				rs1.next();
				String password=rs1.getString("Lpassword");
				session.setAttribute("password",password);
				session.setAttribute("email",rs1.getString("Email"));
		    	out.println ("<script type=\"text/javascript\">");
						out.println("alert('Your Password is: "+password+"');");
						out.println("location='JspPages/login.jsp'; ");
						out.println("</script>");
						
				//response.sendRedirect("SendMail");
			}
		}
		catch(Exception e)
		{
//		    	JOptionPane.showMessageDialog(null,"Ans is wrong");
//		    	response.sendRedirect("JspPages/showquestion.jsp");
		    	out.println ("<script type=\"text/javascript\">");
				out.println("alert('Security Answer is Wrong!');");
				out.println("location='JspPages/showquestion.jsp'; ");
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
