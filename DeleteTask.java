

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
 * Servlet implementation class DeleteTask
 */
@WebServlet("/DeleteTask")
public class DeleteTask extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteTask() {
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
	       String tid=request.getParameter("tid");
	       /*int con=JOptionPane.showConfirmDialog(null,"do you want to delete?");
	       if(con==0)
	       {*/
	    	   int rs=Db.deleteRecord("delete from Task where Tid="+tid);
	    	   if(rs>0)
	    	   {
	    		//   JOptionPane.showMessageDialog(null,"Task Deleted!!");		    
	    		   response.sendRedirect("DisplayTask");
	    	   }
	    	   else
	    	   {
	    		//   JOptionPane.showMessageDialog(null,"Task Deletion fail");		    
	    		//   response.sendRedirect("DisplayTask");
		   			out.println ("<script type=\"text/javascript\">");
					out.println("alert('Failed to Delete!');");
					out.println("location='DisplayTask'; ");
					out.println("</script>");
	    	   }
	       
	       /*else
	       {
	    	   response.sendRedirect("DisplayTask");
	       }*/
		}
		
		catch(Exception e)
		{
//			JOptionPane.showMessageDialog(null,"Deletion fail");		    
//			response.sendRedirect("DisplayTask");
   			out.println ("<script type=\"text/javascript\">");
			out.println("alert('Failed to Delete!');");
			out.println("location='DisplayTask'; ");
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
