package com.simplilearn.accounts.exception;

public class ProductNotFound extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public ProductNotFound(String message){
		super(message);
	}
}
