

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DB.DB;

/**
 * Servlet implementation class DisplayTodayTask
 */
@WebServlet("/DisplayTodayTask")
public class DisplayTodayTask extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayTodayTask() {
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
			response.setContentType("text/html");
			int uid=(Integer)session.getAttribute("uid");		
			DB Db=(DB)session.getAttribute("DB");
			 Db.loadDriver();
			 Db.getConnection();
	
			ResultSet rs1=Db.select("select Tname from Task where datediff(sysdate(),Tdate)=0 and Tpriority = 'important-urgent' and Uid="+uid);
			ResultSet rs2=Db.select("select Tname from Task where datediff(sysdate(),Tdate)=0 and Tpriority = 'not important-urgent' and Uid="+uid);
			ResultSet rs3=Db.select("select Tname from Task where datediff(sysdate(),Tdate)=0 and Tpriority = 'important- not urgent' and Uid="+uid);
			ResultSet rs4=Db.select("select Tname from Task where datediff(sysdate(),Tdate)=0 and Tpriority = 'not important-not urgent' and Uid="+uid);

			
			session.setAttribute("rs1",rs1);
			session.setAttribute("rs2",rs2);
			session.setAttribute("rs3",rs3);
			session.setAttribute("rs4",rs4);

		response.sendRedirect("JspPages/displaytodaytask.jsp");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
