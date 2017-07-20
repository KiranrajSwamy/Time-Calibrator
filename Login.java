

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
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = null;
		   HttpSession session=request.getSession(true);	
		    
		// TODO Auto-generated method stub
		try
		{
		DB Db=new DB();
		
		 Db.loadDriver();
		 Db.getConnection();
	    response.setContentType("text/html");

	    out = response.getWriter();
	    String lname=request.getParameter("lname");
	    String password=request.getParameter("password");        
	    ResultSet rs=Db.select("select * from User where Lname='"+lname+"' and Lpassword='"+password+"'and flag='a'");
		if(rs==null)
		{
				out.println ("<script type=\"text/javascript\">");
				out.println("alert('Invalid Password or Login Name!');");
				out.println("location='JspPages/login.jsp'; ");
				out.println("</script>");
		}
		else
		{

			session.setAttribute("DB",Db);
			session.setAttribute("rs",rs);
			rs.next();
			session.setAttribute("uid",rs.getInt("Uid"));
			session.setAttribute("welcome",rs.getString("Uname"));
			session.setAttribute("email",rs.getString("Email"));
	    	response.sendRedirect("JspPages/home.jsp");
		}
	}
	catch(Exception e)
	{		
			out.println ("<script type=\"text/javascript\">");
			out.println("alert('Invalid Password or Login Name!');");
			out.println("location='JspPages/login.jsp'; ");
			out.println("</script>");
	   
			/*
		session.setAttribute("loginError","Incorrect password or login name");
	    response.sendRedirect("JspPages/login.jsp");
		*/
	}
		
	
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
