

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
 * Servlet implementation class AddTask
 */
@WebServlet("/AddTask")
public class AddTask extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddTask() {
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
	       Db.loadDriver();
	       Db.getConnection();
    
	       String tname=request.getParameter("tname");
		   String date=request.getParameter("tdate");  
	       String Ttime=request.getParameter("ttime");
		   String tstatusdate="1909/09/09";
		//   String Ttime=hh+":"+mm+":00";        
		   String description=request.getParameter("description");
		   String priority=request.getParameter("priority");
		   int uid=(Integer)session.getAttribute("uid");
		   int tid=Db.getMaxId("Task","Tid");
		   int rs=Db.insertRecord("insert into Task values("+tid+","+uid+",'"+tname+"','"+date+"','"+Ttime+"','"+description+"','"+priority+"','"+tstatusdate+"')");
		   if(rs>0)
		   {
			   //JOptionPane.showMessageDialog(null,"Task Inserted!!");		    
			   session.setAttribute("tid", tid);
			   //response.sendRedirect("JspPages/home.jsp");
			   out.println ("<script type=\"text/javascript\">");
			   out.println("alert('Task Added to your List!');");
			   out.println("location='JspPages/home.jsp'; ");
			   out.println("</script>");
		   }
		   else
		   {
//			   JOptionPane.showMessageDialog(null,"Task insertion fail");		    
//			   response.sendRedirect("JspPages/addtask.jsp");
			   out.println ("<script type=\"text/javascript\">");
			   out.println("alert('Failed to add Task!');");
			   out.println("location='JspPages/addtask.jsp'; ");
			   out.println("</script>");
		   }
		}
		catch(Exception e)
		{
//			JOptionPane.showMessageDialog(null,"insertion fail");		    
//			response.sendRedirect("JspPages/addtask.jsp");
			   out.println ("<script type=\"text/javascript\">");
			   out.println("alert('Failed to add Task!');");
			   out.println("location='JspPages/addtask.jsp'; ");
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
