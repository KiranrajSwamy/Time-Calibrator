

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
 * Servlet implementation class UpdateTask
 */
@WebServlet("/UpdateTask")
public class UpdateTask extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateTask() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();			
		try
		{
	       HttpSession session=request.getSession(false);			
	       DB Db=(DB)session.getAttribute("DB");
	       Db.loadDriver();
	       Db.getConnection();

	       String tname=request.getParameter("tname");
		   String date=request.getParameter("date");  
		   String time=request.getParameter("time");        
		   String description=request.getParameter("description");
		   String priority=request.getParameter("priority");
//		   String statusdate=request.getParameter("statusdate");
		   int tid=(Integer)session.getAttribute("tid");
		   int uid=(Integer)session.getAttribute("uid");
		   int rs=Db.insertRecord("update Task set Tname='"+tname+"',Tdate='"+date+"',Ttime='"+time+"',Tdescription='"+description+"',Tpriority='"+priority+"' where Uid="+uid+" and Tid="+tid);
		   if(rs>0)
		   {
			   //JOptionPane.showMessageDialog(null,"Task Updated!!");		    
			   //response.sendRedirect("DisplayTask");
				out.println ("<script type=\"text/javascript\">");
				out.println("alert('Task Updated Successfully!');");
				out.println("location='DisplayTask'; ");
				out.println("</script>");
		   }
		   else
		   {
			   //JOptionPane.showMessageDialog(null,"Task Updation fail");		    
			   //response.sendRedirect("JspPages/updatetask.jsp");
				out.println ("<script type=\"text/javascript\">");
				out.println("alert('Task Updation Failed!');");
				out.println("location='JspPages/updatetask.jsp'; ");
				out.println("</script>");
		   
		   }
		}
		catch(Exception e)
		{
		//	JOptionPane.showMessageDialog(null,"updation fail");		    
		//	response.sendRedirect("JspPages/updatetask.jsp");
			out.println ("<script type=\"text/javascript\">");
			out.println("alert('Task Updation Failed!');");
			out.println("location='JspPages/updatetask.jsp'; ");
			out.println("</script>");
	   
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
