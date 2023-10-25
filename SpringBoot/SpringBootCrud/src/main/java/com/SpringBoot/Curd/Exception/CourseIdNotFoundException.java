package com.SpringBoot.Curd.Exception;

public class CourseIdNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public CourseIdNotFoundException(String message) {
		super(message);
	}
}
