

import java.io.IOException;
import java.io.PrintWriter;
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

import DB.DB;

/**
 * Servlet implementation class TodayEmail
 */
@WebServlet("/TodayEmail")
public class TodayEmail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TodayEmail() {
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
			out.println("location='JspPages/home.jsp'; ");
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
	       	ResultSet rs=Db.select("select * from Task where  Tdate='"+dt+"' and Tstatusdate='1909-09-09' and Uid="+uid);
	      	session.setAttribute("rs",rs);
           	response.sendRedirect("ToDoEmail");

	       	*/
	       	/*String msg="";
	       	
	       	while(rs.next())
	       {
	    	   
	    		msg=msg+"Task-name: "+rs.getString("Tname")+"\nTime: "+rs.getString("Ttime")+"\n Description: "+rs.getString("Tdescription")+"\n Priority: "+rs.getString("Tpriority");
				System.out.println("msg:"+msg);
				
			}
	       	System.out.println("mail content :"+msg);
	    	session.setAttribute("rs2",rs2);
	       	ResultSetMetaData rsmd=(ResultSetMetaData)rs.getMetaData();  
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
