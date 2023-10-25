package com.SpringBoot.Curd.Exception;

public class BatchIdNotFoundException extends RuntimeException{

	
	private static final long serialVersionUID = 1L;
	
	public BatchIdNotFoundException(String message) {
		super(message);
	}

}
