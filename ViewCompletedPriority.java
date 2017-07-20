

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DB.DB;

/**
 * Servlet implementation class ViewCompletedPriority
 */
@WebServlet("/ViewCompletedPriority")
public class ViewCompletedPriority extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewCompletedPriority() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();			
		try
		{
			HttpSession session=request.getSession(false);			
			response.setContentType("text/html");
			String mindate=request.getParameter("mindate");  
			String maxdate=request.getParameter("maxdate"); 
			String priority=request.getParameter("priority");
			int uid=(Integer)session.getAttribute("uid");		
			DB Db=(DB)session.getAttribute("DB");
			 Db.loadDriver();
			 Db.getConnection();
			ResultSet rs=Db.select("select Tname,Tdate,Ttime,Tdescription,Tpriority,Tstatusdate from Task where Tdate>='"+mindate+"' and Tdate<='"+maxdate+"' and Tpriority='"+priority+"' and  Tstatusdate<>'1909/09/09' and Uid="+uid+" order by Tdate");
			session.setAttribute("rs",rs);
			response.sendRedirect("JspPages/viewcompletedpriority.jsp");
		}
		catch(Exception e)
		{
			out.println ("<script type=\"text/javascript\">");
			out.println("alert('Try Again!');");
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
