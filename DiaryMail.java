

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.net.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import javax.mail.AuthenticationFailedException;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * Servlet implementation class DiaryMail
 */
@WebServlet("/DiaryMail")
public class DiaryMail extends HttpServlet {
	private static final long serialVersionUID = 1L;


	
	protected void processRequest(HttpServletRequest request, 
            HttpServletResponse response)
throws IOException, ServletException, SQLException {
		final String err = "JspPages/error.jsp";
		final String succ = "JspPages/readdiary.jsp";
		HttpSession session1 = request.getSession(false);
	    
	       String date=request.getParameter("date");
	       
	       String content=request.getParameter("content");
	       //System.out.println("date:"+date+"content"+content);
	       
		//String pwd = (String)session1.getAttribute("password");
		String eid = (String)session1.getAttribute("email");
		System.out.println("In email servlet");


		String from = "timecalibrator2015@gmail.com";
		String to =eid;
		String subject = "Time calibrator Diary";
		String message ="Your diary for "+date+"\n Content: "+content;
		String login = "timecalibrator2015@gmail.com";
		String password = "goalplanning2015";
			
		Properties props = new Properties();
		try {
		props.setProperty("mail.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");  
		props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");  
		props.setProperty("mail.smtp.auth", "true");
		props.setProperty("mail.smtp.port", "465");
		props.setProperty("mail.smtp.starttls.enable", "true");

			


		Authenticator auth = new SMTPAuthenticator(login, password);
		System.out.println("In email servlet...");
		Session session = Session.getInstance(props, auth);
		System.out.println("In email servlet*****");


		MimeMessage msg = new MimeMessage(session);
		msg.setText(message);
		msg.setSubject(subject);
		msg.setFrom(new InternetAddress(from));
		msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
		Transport.send(msg);

		System.out.println("In email servlet+++++");

		} catch (AuthenticationFailedException ex) {
		request.setAttribute("ErrorMessage", "Authentication failed");

		RequestDispatcher dispatcher = request.getRequestDispatcher(err);
		dispatcher.forward(request, response);

		} catch (AddressException ex) {
		request.setAttribute("ErrorMessage", "Wrong email address");

		RequestDispatcher dispatcher = request.getRequestDispatcher(err);
		dispatcher.forward(request, response);

		} catch (MessagingException ex) {
		request.setAttribute("ErrorMessage", ex.getMessage());

		RequestDispatcher dispatcher = request.getRequestDispatcher(err);
		dispatcher.forward(request, response);
		}
		response.sendRedirect(succ);
		}
			private class SMTPAuthenticator extends Authenticator {

		        private PasswordAuthentication authentication;

		        public SMTPAuthenticator(String login, String password) {
		            authentication = new PasswordAuthentication(login, password);
		        }

		        protected PasswordAuthentication getPasswordAuthentication() {
		            return authentication;
		        }
		    }


    /**
     * @see HttpServlet#HttpServlet()
     */
    public DiaryMail() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		try {
			processRequest(request,response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
