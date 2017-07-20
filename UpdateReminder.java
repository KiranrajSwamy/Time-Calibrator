

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
 * Servlet implementation class UpdateReminder
 */
@WebServlet("/UpdateReminder")
public class UpdateReminder extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateReminder() {
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
	       int rid=(Integer)session.getAttribute("rid");

		PrintWriter out = response.getWriter();			
		try
		{
	       DB Db=(DB)session.getAttribute("DB");
	       Db.loadDriver();
	       Db.getConnection();
	       String rdate=request.getParameter("rdate");  
		   String rtime=request.getParameter("rtime");        
		
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
//	       		JOptionPane.showMessageDialog(null,"Time already passed");	
 //     		response.sendRedirect("JspPages/updatereminder.jsp?rid="+rid);
      			out.println ("<script type=\"text/javascript\">");
    			out.println("alert('Time Already Passed!');");
    			out.println("location='JspPages/updatereminder.jsp?rid="+rid+"'; ");
    			out.println("</script>");
	       	}
	       	else
		   {
	       		int rs=Db.insertRecord("update Reminder set Rdate='"+rdate+"',Rtime='"+rtime+"' where Rid="+rid);
	       		if(rs>0)
	       		{
//	       			JOptionPane.showMessageDialog(null,"Reminder Updated!!");		    
	       			response.sendRedirect("JspPages/showremindertask.jsp");
	       		}
	       		else
	       		{
	    //   			JOptionPane.showMessageDialog(null,"Reminder Updation fail");		    
	     //  			response.sendRedirect("JspPages/updatereminder.jsp");
	       			out.println ("<script type=\"text/javascript\">");
	    			out.println("alert('Failed to add reminder!');");
	    			out.println("location='JspPages/updatereminder.jsp?rid="+rid+"'; ");
	    			out.println("</script>");
		
	       		}
		   }
		}
		catch(Exception e)
		{
//			JOptionPane.showMessageDialog(null,"Reminder updation fail");		    
//			response.sendRedirect("JspPages/updatereminder.jsp");
   			out.println ("<script type=\"text/javascript\">");
			out.println("alert('Failed to add reminder!');");
			out.println("location='JspPages/updatereminder.jsp?rid="+rid+"'; ");
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
