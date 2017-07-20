

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
 * Servlet implementation class AddContact
 */
@WebServlet("/AddContact")
public class AddContact extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddContact() {
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
    
	       String fname=request.getParameter("fname");
	       String lname=request.getParameter("lname");
	       String email=request.getParameter("email");        
		   String address=request.getParameter("address");
		   String homecontactno=request.getParameter("homecontactno");
		   String cellno=request.getParameter("cellno");
		   String officeno=request.getParameter("officeno");        
		   int cid=Db.getMaxId("Contactbook","Cid");
		   int uid=(Integer)session.getAttribute("uid");
		   int rs=Db.insertRecord("insert into Contactbook values("+cid+","+uid+",'"+fname+"','"+lname+"','"+email+"','"+address+"','"+homecontactno+"','"+cellno+"','"+officeno+"')");
		   if(rs>0)
		   {
			  // JOptionPane.showMessageDialog(null,"Contact Inserted!!");		    
			   session.setAttribute("cid", cid);
			   response.sendRedirect("JspPages/showcontact.jsp");
		   }
		   else
		   {
			//   JOptionPane.showMessageDialog(null,"Contact insertion fail");		    
			//   response.sendRedirect("JspPages/addcontact.jsp");
			   	out.println ("<script type=\"text/javascript\">");
				out.println("alert('Wrong info!');");
				out.println("location='JspPages/addcontact.jsp'; ");
				out.println("</script>");
		   }
		}
		catch(Exception e)
		{
//			JOptionPane.showMessageDialog(null,"Contact insertion fail");		    
//			response.sendRedirect("JspPages/addcontact.jsp");
		   	out.println ("<script type=\"text/javascript\">");
			out.println("alert('Wrong info!');");
			out.println("location='JspPages/addcontact.jsp'; ");
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
