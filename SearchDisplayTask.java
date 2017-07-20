

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
 * Servlet implementation class SearchDisplayTask
 */
@WebServlet("/SearchDisplayTask")
public class SearchDisplayTask extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchDisplayTask() {
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
			//System.out.println("in task search");
	       HttpSession session=request.getSession(false);	
	       int uid=(Integer)session.getAttribute("uid");
	       DB Db=(DB)session.getAttribute("DB");
	       Db.loadDriver();
	       Db.getConnection();
	       String tname=request.getParameter("tname");  
	       ResultSet rs2=Db.select("select * from Task where Tname like '"+tname+"%' and Uid="+uid+" and Tstatusdate='1909-09-09'");
	       session.setAttribute("rs2",rs2);
	       response.sendRedirect("JspPages/displaytask.jsp");
		}
		catch(Exception e)
		{		//System.out.println("in catch task search");

		       response.sendRedirect("JspPages/displaytask.jsp");
		}
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
}

}
