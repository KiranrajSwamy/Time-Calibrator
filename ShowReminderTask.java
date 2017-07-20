

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
 * Servlet implementation class ShowReminderTask
 */
@WebServlet("/ShowReminderTask")
public class ShowReminderTask extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowReminderTask() {
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
			//ResultSet rs=Db.select("select * from Task where Tstatusdate='1909/09/09' and Uid="+uid);
			ResultSet rs1=Db.select("select Rid,Reminder.Tid from Task,Reminder where Reminder.Tid=Task.Tid and Tstatusdate='1909/09/09' and Uid="+uid);

			//rs.next();
			//System.out.println("Tid="+rs.getInt(1));
			//session.setAttribute("rs",rs);
			session.setAttribute("rs1",rs1);
			
//			RequestDispatcher rd=request.getRequestDispatcher("JspPages/offreminder.jsp");
			//System.out.println("hello");

//			rd.forward(request,response);
		response.sendRedirect("JspPages/offreminder.jsp");
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
	}

}
