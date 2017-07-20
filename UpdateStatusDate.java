

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
 * Servlet implementation class UpdateStatusDate
 */
@WebServlet("/UpdateStatusDate")
public class UpdateStatusDate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateStatusDate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();			
	      HttpSession session=request.getSession(false);			
	      int tid=(Integer)session.getAttribute("tid");
	try
	  {
		      DB Db=(DB)session.getAttribute("DB");
			  Db.loadDriver();
			  Db.getConnection();
			  String tstatusdate=request.getParameter("tstatusdate");
		      int uid=(Integer)session.getAttribute("uid");

		      int rs=Db.insertRecord("update Task set Tstatusdate='"+tstatusdate+"' where Uid="+uid+" and Tid="+tid);
		      if(rs>0)
		      {
//		    	  JOptionPane.showMessageDialog(null,"Task status date Updated!!");		    
//		    	  response.sendRedirect("DisplayTask");
					out.println ("<script type=\"text/javascript\">");
					out.println("alert('Status Updated!');");
					out.println("location='DisplayTask'; ");
					out.println("</script>");
		   }
		   else
		   {
		//	   JOptionPane.showMessageDialog(null,"Task status date updation fail");		    
			   response.sendRedirect("JspPages/updatestatusdate.jsp?tid="+tid);
		   }
		}
		catch(Exception e)
		{
//			JOptionPane.showMessageDialog(null,"Task status date updation fail");		    
			response.sendRedirect("JspPages/updatestatusdate.jsp?tid="+tid);
			//e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
