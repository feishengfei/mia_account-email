package com.liteon.mvnbook.account;

public class AccountEmailException extends Exception 
{

	private static final long serialVersionUID = 1501764625825461818L;

	public AccountEmailException(String message, Throwable throwable) {
		super(message, throwable);
	}

	public AccountEmailException(String message) {
		super(message);
	}

}
