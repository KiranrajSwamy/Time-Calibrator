

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import DB.DB;

/**
 * Servlet implementation class GetUserInfo
 */
@WebServlet("/GetUserInfo")
public class GetUserInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetUserInfo() {
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
	       //HttpSession session=request.getSession(false);			
	       DB Db=new DB();
	       Db.loadDriver();
	       Db.getConnection();
    
	       String uname=request.getParameter("uname");
		   String contact=request.getParameter("contact");  
		   String email=request.getParameter("email");        
		   String lname=request.getParameter("lname");
		   String password=request.getParameter("password");
		   String cpassword=request.getParameter("cpassword");
		   String secQue=request.getParameter("secQues");        
		   String secAns=request.getParameter("ans");        
		   ResultSet rs1=Db.select("select * from User where lname='"+lname+"'");
   			if(rs1.next())
			{
//   				JOptionPane.showMessageDialog(null,"lname already exist");		    
 //  				response.sendRedirect("JspPages/login.jsp");
   				out.println ("<script type=\"text/javascript\">");
   				out.println("alert('Login-name already exist!');");
   				out.println("location='JspPages/login.jsp'; ");
   				out.println("</script>");
			}
			else
			{
				int id=Db.getMaxId("User","Uid");
				int rs=Db.insertRecord("insert into User values("+id+",'"+uname+"','"+contact+"','"+email+"','"+lname+"','"+password+"','"+secQue+"','"+secAns+"','a')");
				  //System.out.println("insert into User values("+id+",'"+name+"',"+contact+",'"+email+"','"+secQue+"','"+secAns+"','"+lname+"','"+password+"')"); 
				if(rs>0)
				{
//				   JOptionPane.showMessageDialog(null,"insert succes");		    
//				   response.sendRedirect("JspPages/login.jsp");
	   				out.println ("<script type=\"text/javascript\">");
	   				out.println("alert('Sign-up Successfull! plz login!');");
	   				out.println("location='JspPages/login.jsp'; ");
	   				out.println("</script>");

				}
			
			   else
			   {
//				   System.out.println("hello");
//				   JOptionPane.showMessageDialog(null,"insertion fail");		    
//				   response.sendRedirect("JspPages/login.jsp");
	   				out.println ("<script type=\"text/javascript\">");
	   				out.println("alert('Sign-up Failed!');");
	   				out.println("location='JspPages/login.jsp'; ");
	   				out.println("</script>");
			   }
			}

			}
			
		catch(Exception e)
		{
	//		JOptionPane.showMessageDialog(null,"insertion fail");		    
	//		response.sendRedirect("JspPages/login.jsp");
				out.println ("<script type=\"text/javascript\">");
				out.println("alert('Sign-up Failed!');");
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