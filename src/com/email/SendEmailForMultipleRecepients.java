package com.email;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmailForMultipleRecepients {

	public static void main(String[] args) {
		
		final String username = "thalupulamma@primesoftinc.com";
		final String password = "724prime";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.alphaclinicalsystems.com");
		props.put("mail.smtp.port", "587");
		Session session = Session.getDefaultInstance(props);

		/*Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });*/
	
		List<String> toAddress = new ArrayList<>();
		List<String> ccAddress = new ArrayList<>();
		List<String> bccAddress = new ArrayList<>();
		
		toAddress.add("vinay@alphaclinicalsystems.com");
		ccAddress.add("chaitanya@alphaclinicalsystems.com");
		bccAddress.add("thalupulamma@alphaclinicalsystems.com");
		
	
	try {

		Message message = new MimeMessage(session);
		message.setFrom(new InternetAddress("thalupulamma@primesoftinc.com"));
		
		
		/*message.setRecipients(Message.RecipientType.TO,
			InternetAddress.parse("thalupulamma@alphaclinicalsystems.com"));*/
		
		 for(Integer i = 0 ; i< toAddress.size();i++){
	     	message.addRecipient(Message.RecipientType.TO, new InternetAddress(toAddress.get(i)));
      	 }
		 
		 for(Integer i = 0 ; i< ccAddress.size();i++){
		     	message.addRecipient(Message.RecipientType.CC, new InternetAddress(ccAddress.get(i)));
      	 }
		 
		 for(Integer i = 0 ; i< bccAddress.size();i++){
	     	message.addRecipient(Message.RecipientType.BCC, new InternetAddress(bccAddress.get(i)));
      	 }
		
		
		
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
