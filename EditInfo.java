

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import DB.DB;

/**
 * Servlet implementation class EditInfo
 */
@WebServlet("/EditInfo")
public class EditInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditInfo() {
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
 	       String uname=request.getParameter("uname");
 	       String contact=request.getParameter("contact");  
 	       String email=request.getParameter("email");        
 	       int rowsAffected=Db.insertRecord("update User set Uname='"+uname+"',Contact='"+contact+"',Email='"+email+"' where Uid="+uid);
 	       if(rowsAffected>0)
 	       {
 	    	   session.setAttribute("welcome", uname);
 	    	   session.setAttribute("email", email);
 	 	    
 	    	   //   JOptionPane.showMessageDialog(null,"updated succesfully");		    
 	    	 //  response.sendRedirect("JspPages/home.jsp");

 				out.println ("<script type=\"text/javascript\">");
 				out.println("alert('Profile Updated!');");
 				out.println("location='JspPages/home.jsp'; ");
 				out.println("</script>");
 		   
 	       }
 	       else
 	       {
 	    	   //JOptionPane.showMessageDialog(null,"Profile updation fail..Try Again!");		    
 	    	   //response.sendRedirect("JspPages/editinfo.jsp");

 				out.println ("<script type=\"text/javascript\">");
 				out.println("alert('Profile updation fail..Try Again!');");
 				out.println("location='JspPages/editinfo.jsp'; ");
 				out.println("</script>");
 		   
 	       }
		}
		catch(Exception e)
		{
//			JOptionPane.showMessageDialog(null,"updation fail");		    
//			response.sendRedirect("JspPages/editinfo.jsp");
				out.println ("<script type=\"text/javascript\">");
				out.println("alert('Profile updation fail..Try Again!');");
				out.println("location='JspPages/editinfo.jsp'; ");
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
