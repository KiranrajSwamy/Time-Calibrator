

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
 * Servlet implementation class ActivateAccount
 */
@WebServlet("/ActivateAccount")
public class ActivateAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ActivateAccount() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{	PrintWriter out =null;
		try
		{
		DB Db=new DB();
		
		Db.loadDriver();
		Db.getConnection();
	    response.setContentType("text/html");

	       HttpSession session=request.getSession(true);
	    out= response.getWriter();
	    String lname=request.getParameter("lname");
	    String password=request.getParameter("password");        
		   int rs=Db.insertRecord("update User set flag='a' where Lname='"+lname+"' and Lpassword='"+password+"'");
		   if(rs>0)
		   {
			   //JOptionPane.showMessageDialog(null,"Account activated!");		    
			   //response.sendRedirect("JspPages/login.jsp");
			    out.println ("<script type=\"text/javascript\">");
				out.println("alert('Account Activated!');");
				out.println("location='JspPages/login.jsp'; ");
				out.println("</script>");
		   }
		   else
		   {
			//   JOptionPane.showMessageDialog(null,"Account activation fail");		    
			 //  response.sendRedirect("JspPages/activateaccount.jsp");
			   out.println ("<script type=\"text/javascript\">");
				out.println("alert('Wrong info!');");
				out.println("location='JspPages/login.jsp'; ");
				out.println("</script>");
		   
		   }
		  		
	}
	catch(Exception e)
	{		//JOptionPane.showMessageDialog(null,"Wrong info");
	    	//response.sendRedirect("JspPages/login.jsp");
	    	out.println ("<script type=\"text/javascript\">");
			out.println("alert('Wrong info!');");
			out.println("location='JspPages/login.jsp'; ");
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
