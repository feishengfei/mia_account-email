package com.liteon.mvnbook.account;

import org.springframework.mail.javamail.JavaMailSender;

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
			
		} 
		catch (Exception e) 
		{
			
		}
	}

}
