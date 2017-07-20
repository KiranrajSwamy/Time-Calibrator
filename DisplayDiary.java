

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
 * Servlet implementation class DisplayDiary
 */
@WebServlet("/DisplayDiary")
public class DisplayDiary extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayDiary()
    {
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
			String dt=request.getParameter("dt");
			String yr=request.getParameter("yr");
			String m=request.getParameter("m");
			int uid=(Integer)session.getAttribute("uid");
			String t=yr+"-"+m+"-"+dt;
			session.setAttribute("date",t);
			//System.out.println("date is"+t);
			response.setContentType("text/html");
			DB Db=(DB)session.getAttribute("DB");
			 Db.loadDriver();
			 Db.getConnection();
	    
			ResultSet rs = Db.select("select * from Diary where Ddate='"+t+"' and Uid="+uid);
			if(rs!=null)
			{
				rs.next();
				session.setAttribute("did",rs.getInt("Did"));
				session.setAttribute("content",rs.getString("Dcontent"));
				response.sendRedirect("JspPages/newdiary.jsp");
			}
			else
			{	
				response.sendRedirect("JspPages/newdiary1.jsp");
			}
		}
		catch(Exception e)
		{
			response.sendRedirect("JspPages/newdiary1.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
