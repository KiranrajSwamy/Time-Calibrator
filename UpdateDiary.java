

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
 * Servlet implementation class UpdateDiary
 */
@WebServlet("/UpdateDiary")
public class UpdateDiary extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateDiary() {
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
    	   String content=request.getParameter("content");  
    	   //String date=(String)session.getAttribute("date");
		   int uid=(Integer)session.getAttribute("uid");
		   int did=(Integer)session.getAttribute("did");
		   int rs=Db.insertRecord("update Diary set Dcontent='"+content+"' where Did="+did+" and Uid="+uid);
		   if(rs>0)
		   {
			  // JOptionPane.showMessageDialog(null,"Dairy Updated!!");		    
			  // session.setAttribute("tid", tid);
			  // response.sendRedirect("JspPages/home.jsp");
			   out.println ("<script type=\"text/javascript\">");
				out.println("alert('Diary Updated!');");
				out.println("location='JspPages/home.jsp'; ");
				out.println("</script>");
		   }
		   else
		   {
			  // JOptionPane.showMessageDialog(null,"Dairy updation failed");		    
			  // response.sendRedirect("JspPages/newdiary.jsp");
			   out.println ("<script type=\"text/javascript\">");
				out.println("alert('Diary Updation Failed.. Try Again!');");
				out.println("location='JspPages/newdiary.jsp'; ");
				out.println("</script>");
		   }
		   		}
		catch(Exception  e)
		{
			//   JOptionPane.showMessageDialog(null,"Dairy Creation failed");		    
			//   response.sendRedirect("JspPages/newdiary.jsp");
			   out.println ("<script type=\"text/javascript\">");
				out.println("alert('Diary Updation Failed.. Try Again!');");
				out.println("location='JspPages/newdiary.jsp'; ");
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
