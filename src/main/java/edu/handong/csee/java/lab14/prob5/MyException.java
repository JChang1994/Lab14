package edu.handong.csee.java.lab14.prob5;

public class MyException extends Exception{
	//We use this variable to store the message that is passed down.
	private String message = null;
	//We want to use Exception as a constructor
	public MyException() {
		super();
	}
	//We use this constructor to accept message as a parameter and then set it in this object
	public MyException(String message) {
		this.message = message;
	}
	//If we reach an exception then we use Exception's methods to throw an exception and the reason why
	public MyException(Throwable cause) {
		super(cause);
	}
	//We use this method to show that we caught the exception inside of the catch block rather than anywhere else
	public String toString() {
		return "Inside catch block: " + message;
	}
}
