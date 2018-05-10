package edu.handong.csee.java.lab14.prob5;

public class MyException extends Exception{
	private String message = null;
	
	public MyException() {
		super();
	}
	
	public MyException(String message) {
		this.message = message;
	}
	
	public MyException(Throwable cause) {
		super(cause);
	}

	public String toString() {
		return "Inside catch block: " + message;
	}
}
