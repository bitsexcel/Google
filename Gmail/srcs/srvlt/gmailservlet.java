package srvlt;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.GeneralSecurityException;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import com.google.api.services.gmail.model.Message;

import bitsexcel.CreateEmail;
import bitsexcel.CreateMessage;
import bitsexcel.GmailQuickstart;
import bitsexcel.SendMessage;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class gmailservlet
 */
public class gmailservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public gmailservlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		String message = "testing here";
	      out.println("<h1>" + message + "</h1>");
	      //CreateEmail ce = new CreateEmail();
	      try {
	    	  GmailQuickstart gqs = new GmailQuickstart();
	    	  //Credential c = gqs.
	    	  gqs.main();
				/*
				 * MimeMessage mm = ce.createEmail("daniel.perezvindas@outlook",
				 * "daniel.perezvindas@gmail.com", "testing", "message body here for send");
				 * CreateMessage cm = new CreateMessage(); Message m1 =
				 * cm.createMessageWithEmail(mm);
				 */
				/*
				 * SendMessage sm = new SendMessage(); Message m2 =
				 * sm.sendEmail("daniel.perezvindas@gmail.com", "daniel.perezvindas@outlook");
				 */
			} /*
				 * catch (MessagingException e) { // TODO Auto-generated catch block
				 * e.printStackTrace(); }
				 */ catch (GeneralSecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
