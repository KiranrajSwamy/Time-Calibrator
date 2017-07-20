

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DB.DB;

/**
 * Servlet implementation class AddNewReminder
 */
@WebServlet("/AddNewReminder")
public class AddNewReminder extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddNewReminder() {
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
			
//			select Task.Tid from Task where Tstatusdate='1909/09/09' and Uid=3 and Tid not in(select Tid from Reminder)
			
			//ResultSet rs=Db.select("select * from Task where Tstatusdate='1909/09/09' and Uid="+uid);
			ResultSet rs=Db.select("select Task.Tid,Task.Tname,Task.Tdescription,Task.Tpriority from Task where Tstatusdate='1909/09/09' and Uid="+uid+" and Tid not in(select Tid from Reminder)");

			//rs.next();
			//System.out.println("Tid="+rs.getInt(1));
			session.setAttribute("rs",rs);
	//		session.setAttribute("rs1",rs1);
			
			//RequestDispatcher rd=request.getRequestDispatcher("JspPages/addnewreminder.jsp");
			//rd.forward(request,response);
			response.sendRedirect("JspPages/addnewreminder.jsp");
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
