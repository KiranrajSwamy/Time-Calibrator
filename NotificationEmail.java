

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.jdbc.ResultSetMetaData;

import DB.DB;

/**
 * Servlet implementation class NotificationEmail
 */
@WebServlet("/NotificationEmail")
public class NotificationEmail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NotificationEmail() {
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
			PrintWriter out = response.getWriter();
		out.println ("<script type=\"text/javascript\">");
		out.println("alert('Check Your Internet Connection!');");
		out.println("location='JspPages/notification.jsp'; ");
		out.println("</script>");
       
	       /*HttpSession session=request.getSession(false);	
	       int uid=(Integer)session.getAttribute("uid");
	       DB Db=(DB)session.getAttribute("DB");
			 Db.loadDriver();
			 Db.getConnection();
	       String s1,s2,s3,s4,s5,s6,s_time;
	       Date d=new Date();
	   		StringTokenizer st=new StringTokenizer(d.toString()," ");
	   		s1=st.nextToken();
	   		s2=st.nextToken();
	   		s3=st.nextToken();
	   		s4=st.nextToken();
	   		s5=st.nextToken();
	   		s6=st.nextToken();
	       	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	        String dt=dateFormat.format(new Date());
	       	System.out.println("System date "+dt);
	       	String tid=request.getParameter("tid");
	       	ResultSet rs=Db.select("select * from Task where  Tid="+tid+" and Uid="+uid);
*//*	       	ResultSetMetaData rsmd=(ResultSetMetaData)rs.getMetaData();  
			  rs.last();
			int count=rs.getRow();
			System.out.println("Count"+count);

			rs.beforeFirst();
			
			String msg1="";
			for(int i=1;i<count;i++)
			{	
				rs.next();
				msg1=msg1+rs.getString("Tname")+" ";
				System.out.println("tname"+i+":"+rs.getString("Tname"));
				
			}
			rs.beforeFirst();
			System.out.println("mail content :"+msg1);
*/
	       	
	       	
	       	
	/*              	session.setAttribute("rs2",rs);
	             	response.sendRedirect("EmailTask");
*/
	       	//RequestDispatcher rd=request.getRequestDispatcher("nTask");
		    //rd.forward(request,response);

		}		catch(Exception e)
		{}
	
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
