

import java.io.IOException;
import java.io.PrintWriter;
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
 * Servlet implementation class ReadDiary
 */
@WebServlet("/ReadDiary")
public class ReadDiary extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReadDiary() {
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
			//System.out.println("date is"+t);
			response.setContentType("text/html");
			DB Db=(DB)session.getAttribute("DB");
			 Db.loadDriver();
			 Db.getConnection();
	    
			ResultSet rs = Db.select("select * from Diary where Ddate='"+t+"' and Uid="+uid);
		
			if(!rs.next())
			{
				//JOptionPane.showMessageDialog(null,"No entry");
				//response.sendRedirect("JspPages/readdiary.jsp");
				out.println ("<script type=\"text/javascript\">");
				out.println("alert('No entry!');");
				out.println("location='JspPages/readdiary.jsp'; ");
				out.println("</script>");
			}
			else
			{	
				rs.beforeFirst();
				session.setAttribute("rs",rs);
				response.sendRedirect("JspPages/showdiary.jsp");
			}
		}
		catch(Exception e)
		{
		//	JOptionPane.showMessageDialog(null,"No entry!!");
		//	response.sendRedirect("JspPages/readdiary.jsp");
			out.println ("<script type=\"text/javascript\">");
			out.println("alert('No entry!');");
			out.println("location='JspPages/readdiary.jsp'; ");
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
