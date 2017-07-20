

import java.io.IOException;
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
 * Servlet implementation class SearchContact
 */
@WebServlet("/SearchContact")
public class SearchContact extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchContact() {
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
	       int uid=(Integer)session.getAttribute("uid");
	       DB Db=(DB)session.getAttribute("DB");
			 Db.loadDriver();
			 Db.getConnection();
	       String fname=request.getParameter("fname");  
	       ResultSet rs=Db.select("select * from Contactbook where Firstname like '"+fname+"%' and Uid="+uid);
			if(rs==null)
			{
				JOptionPane.showMessageDialog(null,"Contact not found");
		    	response.sendRedirect("JspPages/showresult.jsp");
			}
			else
			{
				session.setAttribute("rs",rs);
				//JOptionPane.showMessageDialog(null,"Login successfull");
		    	response.sendRedirect("JspPages/showresult.jsp");
			}

		
		
		}
		catch(Exception e)
		{

			JOptionPane.showMessageDialog(null,"Contact not found");
	    	response.sendRedirect("JspPages/showresult.jsp");
		
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
