

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import DB.DB;

/**
 * Servlet implementation class DeleteReminder
 */
@WebServlet("/DeleteReminder")
public class DeleteReminder extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteReminder() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
	
		try
		{

	       HttpSession session=request.getSession(false);			
	       DB Db=(DB)session.getAttribute("DB");
			 Db.loadDriver();
			 Db.getConnection();
	       String rid=request.getParameter("rid");
	 /*      int con=JOptionPane.showConfirmDialog(null,"do you want to delete?");
	       if(con==0)
	       {	       
	   */ 	   int del=Db.deleteRecord("delete from Reminder where Rid="+rid);
	    	   if(del>0)
	    	   {
	    	//	   JOptionPane.showMessageDialog(null,"Reminder Removed!!");		    
	    		   response.sendRedirect("JspPages/showremindertask.jsp");
	    	   }
	    	   else
	    	   {	
	    		   JOptionPane.showMessageDialog(null,"Reminder removing fail");		    
	    		   response.sendRedirect("JspPages/showremindertask.jsp");
	    	   }
	       }
	     /*  else
	       {
	    	   response.sendRedirect("JspPages/showremindertask.jsp");
	       }*/
		
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null,"Reminder removing  fail");		    
			response.sendRedirect("JspPages/showremindertask.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
