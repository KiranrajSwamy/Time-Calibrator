

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import DB.DB;

/**
 * Servlet implementation class Logout
 */
@WebServlet("/Logout")
public class Logout extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Logout() {
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
  		       DB Db=(DB)session.getAttribute("DB");
  		       Db.close();			
  		       session.invalidate();
//				JOptionPane.showMessageDialog(null,"logout");
			//	response.sendRedirect("JspPages/login.jsp");
				out.println ("<script type=\"text/javascript\">");
				out.println("alert('Logged out successfully!');");
				out.println("location='JspPages/login.jsp'; ");
				out.println("</script>");
		}
		catch(Exception e)
		{
			out.println ("<script type=\"text/javascript\">");
			out.println("alert('Log out Failed..Retry!');");
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
