

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
 * Servlet implementation class DeleteAccount
 */
@WebServlet("/DeleteAccount")
public class DeleteAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteAccount() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();			
		try
		{
		     //  int con=JOptionPane.showConfirmDialog(null,"do you want to Delete account?");
		      // if(con==0)
		       //{

	  		       HttpSession session=request.getSession(false);			
	  		       int uid=(Integer)session.getAttribute("uid");
	  		       DB Db=(DB)session.getAttribute("DB");
	  		       Db.loadDriver();
	  		       Db.getConnection();
	  		       int rs=Db.deleteRecord("delete from User where Uid="+uid);
	  			   if(rs>0)
		    	   {
	  				 Db.close();			
	    		     session.invalidate();
	    		     //JOptionPane.showMessageDialog(null,"Account Deleted");
	  				//response.sendRedirect("JspPages/login.jsp");
	  				out.println ("<script type=\"text/javascript\">");
	  				out.println("alert('Account Deleted!! Visit Soon..Thank You!');");
	  				out.println("location='JspPages/login.jsp'; ");
	  				out.println("</script>");
		    	   }
	  			   
		    	   else
		    	   {
		    		   //JOptionPane.showMessageDialog(null,"Deletion fail");		    
		    		   //response.sendRedirect("JspPages/home.jsp");
		    			out.println ("<script type=\"text/javascript\">");
		  				out.println("alert('Account Deleted Failed!!Retry !');");
		  				out.println("location='JspPages/home.jsp'; ");
		  				out.println("</script>");
		    	   }
		      /* }
		       else
		       {
		    	   response.sendRedirect("JspPages/home.jsp");
		       }*/
  		       }
		catch(Exception e)
		{	
				//JOptionPane.showMessageDialog(null,"Deletion fail");		    
				//response.sendRedirect("JspPages/home.jsp");

    			out.println ("<script type=\"text/javascript\">");
  				out.println("alert('Account Deleted Failed!!Retry !');");
  				out.println("location='JspPages/home.jsp'; ");
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
