

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
 * Servlet implementation class UpdateContact
 */
@WebServlet("/UpdateContact")
public class UpdateContact extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateContact() {
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
		HttpSession session=request.getSession(false);			
		int cid=(Integer)session.getAttribute("cid");
		try
		{
	    
	       DB Db=(DB)session.getAttribute("DB");
	       Db.loadDriver();
	       Db.getConnection();
 	       
	       response.setContentType("text/html");
 	       
	       String fname=request.getParameter("fname");
	       String lname=request.getParameter("lname");
	       String email=request.getParameter("email");        
		   String address=request.getParameter("address");
		   String homecontactno=request.getParameter("homecontactno");
		   String cellno=request.getParameter("cellno");
		   String officeno=request.getParameter("officeno"); 
		   
		
		   int uid=(Integer)session.getAttribute("uid");
 	       int rowsAffected=Db.insertRecord("update Contactbook set Firstname='"+fname+"',Lastname='"+lname+"',Email='"+email+"',Address='"+address+"',Homecontactno='"+homecontactno+"',Cellno='"+cellno+"',Officeno='"+officeno+"' where Uid="+uid+" and Cid="+cid);
 	       if(rowsAffected>0)
 	       {
 	    	  // JOptionPane.showMessageDialog(null,"updated succesfully");		    
 	    	  // response.sendRedirect("JspPages/showcontact.jsp");

 				out.println ("<script type=\"text/javascript\">");
 				out.println("alert('updated succesfully!');");
 				out.println("location='JspPages/showcontact.jsp'; ");
 				out.println("</script>");
 	       }
 	       else
 	       {
 	    	   //JOptionPane.showMessageDialog(null,"updation fail");		    
 	    	   //response.sendRedirect("JspPages/updatecontact.jsp");
 	    	
 	    	   out.println ("<script type=\"text/javascript\">");
 	    	   out.println("alert('updation Failed! Try Again');");
 			   out.println("location='JspPages/updatecontact.jsp?cid="+cid+"'; ");
 			   out.println("</script>");
 	       }
		}
		catch(Exception e)
		{
//			JOptionPane.showMessageDialog(null,"updation fail");		    
//			response.sendRedirect("JspPages/updatecontact.jsp");
	    	   out.println ("<script type=\"text/javascript\">");
	    	   out.println("alert('updation Failed! Try Again');");
	    	   out.println("location='JspPages/updatecontact.jsp?cid="+cid+"'; ");
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
