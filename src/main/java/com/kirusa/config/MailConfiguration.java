package com.kirusa.config;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
public class MailConfiguration {

	@Autowired
	private Environment env;

	@Bean
	public JavaMailSender getMailSender() {
		JavaMailSenderImpl mailSender = new JavaMailSenderImpl();

		mailSender.setHost(env.getProperty("spring.mail.host"));
		mailSender.setPort(Integer.valueOf(env.getProperty("spring.mail.port")));
		mailSender.setUsername(env.getProperty("spring.mail.username"));
		mailSender.setPassword(env.getProperty("spring.mail.password"));

		//staging
		Properties javaMailProperties = new Properties();
		javaMailProperties.put("mail.smtp.starttls.enable", "true");
		javaMailProperties.put("mail.smtp.auth", "true");
		javaMailProperties.put("mail.transport.protocol", "smtp");
		javaMailProperties.put("mail.debug", "true");
		
//		Properties javaMailProperties = new Properties();
//		javaMailProperties.put("mail.smtp.starttls.enable", "true");
//		javaMailProperties.put("mail.smtp.auth", "true");
//		javaMailProperties.put("mail.transport.protocol", "smtp");
//		javaMailProperties.put("mail.debug", "true");

		mailSender.setJavaMailProperties(javaMailProperties);
		return mailSender;
	}
	
	@Bean
	public SimpleMailMessage templateSimpleMessage() {
		SimpleMailMessage message = new SimpleMailMessage();
		/*
		 * message.setText( "Hi %s\n\n"
		 * +"Your bot details have been successfully submitted to the Dotgo RCS Directory.\n\n"
		 * );
		 */

		message.setText("Hi %s\n\n" +
				"Your bot details have been successfully submitted to the Dotgo RCS Directory.\n\n" +
				"Developer Details:\n" +
				"First Name : %s\n" +
				"Last Name : %s\n" + 
				"Company Name : %s\n" + 
				"Designation : %s\n" + 
				"Email ID: %s\n" + 
				"Phone Number: %s\n\n" +
				"Bot Details: \n" + 
				"Bot Name : %s\n" + 
				"Short Description : %s\n" + 
				"Category : %s\n" + 
				"Supported Countries: %s\n" + 
				"Description: %s\n" + 
				"Platform: %s\n" + 
				"Privacy Policy URL: %s\n" + 
				"Terms of Use URL: %s\n" + 
				"First Message URL: %s\n" + 
				"Request for Access URL: %s\n"
				);

		return message;
	}
}