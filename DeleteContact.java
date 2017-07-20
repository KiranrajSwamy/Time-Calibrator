

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
 * Servlet implementation class DeleteContact
 */
@WebServlet("/DeleteContact")
public class DeleteContact extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteContact() {
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
	       String cid=request.getParameter("cid");
	       /*int con=JOptionPane.showConfirmDialog(null,"do you want to delete?");
	       if(con==0)
	       {*/
	    	   int rs=Db.deleteRecord("delete from Contactbook where Cid="+cid);
	    	   if(rs>0)
	    	   {
	    		//   JOptionPane.showMessageDialog(null,"Contact Deleted!!");		    
	    		   response.sendRedirect("JspPages/showcontact.jsp");
	    	   }
	    	   else
	    	   {
	    		//   JOptionPane.showMessageDialog(null,"Contact Deletion fail");		    
	    		//   response.sendRedirect("JspPages/showcontact.jsp");
	        	   out.println ("<script type=\"text/javascript\">");
		    	   out.println("alert('Deletion Failed! Retry..');");
		    	   out.println("location='JspPages/showcontact.jsp'; ");
		    	   out.println("</script>");
	    	   }
	       /*}
	       else
	       {
	    	   response.sendRedirect("JspPages/showcontact.jsp");
	       }*/
		}
		catch(Exception e)
		{
		//	JOptionPane.showMessageDialog(null,"Deletion fail");		    
		//	response.sendRedirect("JspPages/showcontact.jsp");
			   out.println ("<script type=\"text/javascript\">");
	    	   out.println("alert('Deletion Failed! Retry..');");
	    	   out.println("location='JspPages/showcontact.jsp'; ");
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
