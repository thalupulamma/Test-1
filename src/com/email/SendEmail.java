package com.email;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmail {
	  
	 public static void main(String[] args) {

			final String username = "thalupulamma@primesoftinc.com";
			final String password = "724prime";

			Properties props = new Properties();
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.host", "smtp.primesoftinc.com");
			props.put("mail.smtp.port", "587");
			
			/*Session session = Session.getInstance(props,
			  new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(username, password);
				}
			  });*/
			Session session = Session.getInstance(props);
			try {

				Message message = new MimeMessage(session);
				message.setFrom(new InternetAddress("thalupulamma@primesoftinc.com"));
				message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse("thalupulamma@alphaclinicalsystems.com"));
				message.setSubject("Testing Subject");
				message.setText("Dear Mail Crawler,"
					+ "\n\n No spam to my email, please!");

				Transport transport = session.getTransport("smtp");
		        transport.connect("smtp.primesoftinc.com", username, password);
		        transport.sendMessage(message,message.getAllRecipients());
		        transport.close();

				System.out.println("Done");

			} catch (MessagingException e) {
				throw new RuntimeException(e);
			}
		}
}
