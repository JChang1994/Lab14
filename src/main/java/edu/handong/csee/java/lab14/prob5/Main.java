package edu.handong.csee.java.lab14.prob5;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		//We need a Scanner object to accept user input
		Scanner keyboard = new Scanner(System.in);
		//We use this variable to store user input
		String inputstr = keyboard.nextLine();
		
		//We use this try/catch block to try the myTest method below and catch an exception if there is one
		try{
			myTest(inputstr);
		}
		catch(MyException e) {
			System.out.println(e.toString());
		}
	}
	//This method is used to throw an exception if the string is equal to the word null.
	public static void myTest(String str) throws MyException{
		//If the string is equal to "null" then myTest will throw an exception
		if(str.equals("null")) {
			throw new MyException("String value is null");
		}
		//Otherwise it will just print out the string's value.
		else {
			System.out.println("String value is " + str);
		}
	}
}
