

import java.io.IOException;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import DB.DB;

/**
 * Servlet implementation class Notification
 */
@WebServlet("/Notification")
public class Notification extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Notification() {
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
	       HttpSession session=request.getSession(false);	
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
	       	ResultSet rs2=Db.select("select * from Task where  Tdate<'"+dt+"' and Tstatusdate='1909-09-09' and Uid="+uid);
	       session.setAttribute("rs2",rs2);
	       response.sendRedirect("JspPages/notification.jsp");
	       //RequestDispatcher rd=request.getRequestDispatcher("JspPages/displaytask.jsp");
	       //rd.forward(request,response);
			
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null,"insertion fail");		    

		       response.sendRedirect("JspPages/home.jsp");
		}

	
	
	
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
