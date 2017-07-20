

import java.io.IOException;
import java.io.PrintWriter;
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
 * Servlet implementation class AddReminder
 */
@WebServlet("/AddReminder")
public class AddReminder extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddReminder() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub

		 HttpSession session=request.getSession(false);			
		 PrintWriter out = response.getWriter();			
		 int tid=(Integer)session.getAttribute("tid");
		 int uid=(Integer)session.getAttribute("uid");		
	      
		try
		{
	       DB Db=(DB)session.getAttribute("DB");
	       Db.loadDriver();
	       Db.getConnection();
	      
	       String rdate=request.getParameter("reminderdate");
	       String rtime=request.getParameter("rtime");
	       int rid=Db.getMaxId("Reminder","Rid");
	       String s1,s2,s3,s4,s5,s6,s_time;
	   	   Date d=new Date();
	   	   StringTokenizer st=new StringTokenizer(d.toString()," ");
	   	   s1=st.nextToken();
	   	   s2=st.nextToken();
	   	   s3=st.nextToken();
	   	   s4=st.nextToken();
	   	   s5=st.nextToken();
	   	   s6=st.nextToken();
	 
	       	StringTokenizer st2=new StringTokenizer(s4,":");
	       	s_time=st2.nextToken()+":"+st2.nextToken();
	       	System.out.println("System time "+s_time);
	      
	       	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	        String dt=dateFormat.format(new Date());
	       	System.out.println("System date "+dt);
	       	
	       	if(rdate.compareTo(dt)<0 || rdate.equals(dt) && rtime.compareTo(s_time)<0)
	       	{	
	       	//	JOptionPane.showMessageDialog(null,"Time already passed");	
     		//	response.sendRedirect("JspPages/addreminder.jsp?tid="+tid);
    			out.println ("<script type=\"text/javascript\">");
    			out.println("alert('Time Already Passed!');");
    			out.println("location='JspPages/addreminder.jsp?tid="+tid+"'; ");
    			out.println("</script>");
	       	}
	       	else
	       	{
	       		int rs=Db.insertRecord("insert into Reminder values("+rid+","+tid+",'"+rdate+"','"+rtime+"')");
	       		if(rs>0)
	       		{
				//   JOptionPane.showMessageDialog(null,"Reminder Added!!");		    
				   response.sendRedirect("DisplayTask");
			   }
			   else
			   {
			//	   JOptionPane.showMessageDialog(null,"failed to add reminder");		    
			//	   response.sendRedirect("JspPages/addreminder.jsp?tid="+tid);
				   out.println ("<script type=\"text/javascript\">");
	    			out.println("alert('Failed to add reminder!');");
	    			out.println("location='JspPages/addreminder.jsp?tid="+tid+"'; ");
	    			out.println("</script>");
		    
			   }
	       	}
	       
	      
	       }
		catch(Exception e)
		{
	//		JOptionPane.showMessageDialog(null,"failed to add reminder");		    
	//		response.sendRedirect("JspPages/addreminder.jsp?tid="+tid);
			out.println ("<script type=\"text/javascript\">");
			out.println("alert('Failed to add reminder!');");
			out.println("location='JspPages/addreminder.jsp?tid="+tid+"'; ");
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
