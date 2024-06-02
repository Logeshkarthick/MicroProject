//package com.ock.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.mail.SimpleMailMessage;
//import org.springframework.mail.javamail.JavaMailSenderImpl;
//import org.springframework.stereotype.Service;
//
//
//@Service
//public class MailService {
//	
//	@Autowired
//	private JavaMailSenderImpl mailsender;
//	
//	public void sendMail(String payment, String mail) {
//		SimpleMailMessage message=new SimpleMailMessage();
//		message.setFrom("logeshkarthick934@gmail.com");
//		message.setTo(mail);
//		
//		String body = "Your Order is successfully placed for the amount " + payment + ".\\n\\n\\n\\n ****Thank You****";
//		String subject = "Order Conformation mail from Cloud Kitchen";
//		
//		message.setText(body);
//		message.setSubject(subject);
//		mailsender.send(message);
//		System.out.println("sended");
// 
//	}
//
//}
