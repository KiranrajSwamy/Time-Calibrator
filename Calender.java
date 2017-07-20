

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DB.DB;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calender
 */
@WebServlet("/Calender")
public class Calender extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calender() {
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
			
			String dt=request.getParameter("dt");
			String yr=request.getParameter("yr");
			String m=request.getParameter("m");
			int uid=(Integer)session.getAttribute("uid");
			String t=yr+"-"+m+"-"+dt;
			System.out.println("date is"+t);
			response.setContentType("text/html");
			DB Db=(DB)session.getAttribute("DB");
			Db.loadDriver();
			Db.getConnection();
	    
			String str=" select Tname,Tdate,Ttime,Tdescription,Tpriority,Tstatusdate from Task where datediff(Tdate,'"+t+"')=0 and Uid="+uid;
			ResultSet rs = Db.select(str);
			//System.out.println(str);
			session.setAttribute("rs", rs);
			response.sendRedirect("JspPages/calenderdisplay.jsp");
						
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
