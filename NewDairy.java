

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
 * Servlet implementation class NewDairy
 */
@WebServlet("/NewDairy")
public class NewDairy extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewDairy() {
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
    	   String date=(String)session.getAttribute("date");
		   int uid=(Integer)session.getAttribute("uid");
		   int did=Db.getMaxId("Diary","Did");
		   int rs=Db.insertRecord("insert into Diary values("+did+","+uid+",'"+date+"','"+content+"')");
		   if(rs>0)
		   {
			//   JOptionPane.showMessageDialog(null,"Dairy Created!!");		    
			  // session.setAttribute("tid", tid);
			 //  response.sendRedirect("JspPages/home.jsp");
				out.println ("<script type=\"text/javascript\">");
				out.println("alert('Diary Created!');");
				out.println("location='JspPages/home.jsp'; ");
				out.println("</script>");
		   }
		   else
		   {
			//   JOptionPane.showMessageDialog(null,"Dairy Creation failed");		    
			 //  response.sendRedirect("JspPages/newdiary1.jsp");
				out.println ("<script type=\"text/javascript\">");
				out.println("alert('Diary Creation Failed Try Again!');");
				out.println("location='JspPages/newdiary1.jsp'; ");
				out.println("</script>");
		   }
		}
		catch(Exception  e)
		{
//			   JOptionPane.showMessageDialog(null,"Dairy Creation failed");		    
//			   response.sendRedirect("JspPages/newdiary1.jsp");
				out.println ("<script type=\"text/javascript\">");
				out.println("alert('Diary Creation Failed Try Again!');");
				out.println("location='JspPages/newdiary1.jsp'; ");
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
