package com.liteon.mvnbook.account;

public interface AccountEmailService 
{
	void sendMail(String to, String subject, String htmltext)
		throws AccountEmailException;
}
