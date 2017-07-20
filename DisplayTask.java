

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import DB.DB;

/**
 * Servlet implementation class DisplayTask
 */
@WebServlet("/DisplayTask")
public class DisplayTask extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayTask() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		//doPost(request,response);
		
		try
		{
	       HttpSession session=request.getSession(false);	
	       int uid=(Integer)session.getAttribute("uid");
	       DB Db=(DB)session.getAttribute("DB");
			 Db.loadDriver();
			 Db.getConnection();
    
	       
	       ResultSet rs2=Db.select("select * from Task where Uid="+uid+" and Tstatusdate='1909-09-09'");
	       session.setAttribute("rs2",rs2);
	       response.sendRedirect("JspPages/displaytask.jsp");
	       //RequestDispatcher rd=request.getRequestDispatcher("JspPages/displaytask.jsp");
	       //rd.forward(request,response);
			
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null,"insertion fail");		    

		       response.sendRedirect("JspPages/home.jsp");
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
