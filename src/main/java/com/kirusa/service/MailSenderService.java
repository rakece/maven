package com.kirusa.service;

import java.util.ArrayList;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class MailSenderService {

	private static final Log logger = LogFactory.getLog(MailSenderService.class);

	@Autowired
	private JavaMailSender javaMailSender;

	@Autowired
	public SimpleMailMessage template;
	
	@Async
	public void sendEmail(String to, String subject, ArrayList<String> body) {
		logger.info("sending mail to [" + to + "], sub [" + subject + "], body [" + body + "]");
		String[] arr = body.stream().toArray(String[] ::new); 
		String text = String.format(template.getText(), arr);  
		
		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setFrom("noreply-partners@dotgo.com");
		msg.setTo(to);
		msg.setSubject(subject);
//		msg.setText(body);
		msg.setText(text);
		javaMailSender.send(msg);
	}
	
	@Async
	public void sendSubmitedEmail(String to, String subject, String body) {
		logger.info("sending mail to [" + to + "], sub [" + subject + "], body [" + body + "]");
		logger.info("Mail sender : "+javaMailSender.toString());
		try {
			SimpleMailMessage msg = new SimpleMailMessage();
//			msg.setFrom("noreply-partners@dotgo.com");
			msg.setFrom("noreply@dotgo.com");
			msg.setTo(to);
			msg.setSubject(subject);
			msg.setText(body);
			javaMailSender.send(msg);
			logger.info("eMail sent successfully");
		} catch (Exception e) {
			logger.error("Error while sending email : "+e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	@Async
	public void sendAtivatedEmail(String to, String subject, String body) {
		logger.info("sending mail to [" + to + "], sub [" + subject + "], body [" + body + "]");
		logger.info("Mail sender : "+javaMailSender.toString());
		try {
			SimpleMailMessage msg = new SimpleMailMessage();
//			msg.setFrom("noreply-partners@dotgo.com");
			msg.setFrom("noreply@dotgo.com");
			msg.setTo(to);
			msg.setSubject(subject);
			msg.setText(body);
			javaMailSender.send(msg);
			logger.info("eMail sent successfully");
		} catch (Exception e) {
			logger.error("Error while sending email : "+e.getMessage());
			e.printStackTrace();
		}
		
	}
}
