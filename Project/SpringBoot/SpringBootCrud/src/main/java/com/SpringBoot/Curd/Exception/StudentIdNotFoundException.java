package com.SpringBoot.Curd.Exception;

public class StudentIdNotFoundException extends RuntimeException {

	
	private static final long serialVersionUID = 1L;

	public  StudentIdNotFoundException(String message) {
		super(message);
	}
}
