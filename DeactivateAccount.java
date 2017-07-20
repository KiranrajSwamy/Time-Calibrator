

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
 * Servlet implementation class DeactivateAccount
 */
@WebServlet("/DeactivateAccount")
public class DeactivateAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeactivateAccount() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();	
		try
		{
		 //      int con=JOptionPane.showConfirmDialog(null,"do you want to Deactivate account?");
		    //   if(con==0)
		      // {

	  		       HttpSession session=request.getSession(false);			
	  		       int uid=(Integer)session.getAttribute("uid");
	  		       DB Db=(DB)session.getAttribute("DB");
	  		       Db.loadDriver();
	  		       Db.getConnection();

	  			   int rs=Db.insertRecord("update User set flag='d' where Uid="+uid);
	  			   if(rs>0)
		    	   {
	  				 Db.close();			
	    		     session.invalidate();
	    		 	out.println ("<script type=\"text/javascript\">");
	  				out.println("alert('Account De-Activated!! Login Soon..Thank You!');");
	  				out.println("location='JspPages/login.jsp'; ");
	  				out.println("</script>");
	  				//response.sendRedirect("JspPages/login.jsp");
	  			}
		    	   else
		    	   {
		    		   JOptionPane.showMessageDialog(null,"Deactivation fail");		    
		    		   response.sendRedirect("JspPages/home.jsp");
		    			out.println ("<script type=\"text/javascript\">");
		  				out.println("alert('Account De-Activation Failed!! Retry!');");
		  				out.println("location='JspPages/home.jsp'; ");
		  				out.println("</script>"); 
		    	   }
		       /*}
		       else
		       {
		    	   response.sendRedirect("JspPages/home.jsp");
		       }*/
  		       }
		catch(Exception e)
		{	
			//JOptionPane.showMessageDialog(null,"Deactivation fail");		    
		//   response.sendRedirect("JspPages/home.jsp");
		   out.println ("<script type=\"text/javascript\">");
				out.println("alert('Account De-Activation Failed!! Retry!');");
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
