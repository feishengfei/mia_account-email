package com.liteon.mvnbook.account;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

public class AccountEmailServiceImpl implements AccountEmailService 
{
	private JavaMailSender javaMailSender;
	
	private String systemEmail;

	@Override
	public void sendMail(String to, String subject, String htmltext)
			throws AccountEmailException 
	{
		try 
		{
			MimeMessage msg = javaMailSender.createMimeMessage();
			MimeMessageHelper msgHelper = new MimeMessageHelper(msg);
			
			msgHelper.setFrom(systemEmail);
			msgHelper.setTo(to);
			msgHelper.setSubject(subject);
			msgHelper.setText(htmltext, true);
		} 
		catch (MessagingException e) {
			throw new AccountEmailException("Failed to send mail.", e);
		}
	}
	
	public JavaMailSender getJavaMailSender()
	{
		return javaMailSender;
	}
	
	public void setJavaMailSender(JavaMailSender javaMailSender)
	{
		this.javaMailSender = javaMailSender;
	}
	
	public String getSystemEmail()
	{
		return systemEmail;
	}
	
	public void setSystemEmail(String systememail)
	{
		this.systemEmail = systemEmail;
	}

}
