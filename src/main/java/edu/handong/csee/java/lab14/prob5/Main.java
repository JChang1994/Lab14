package edu.handong.csee.java.lab14.prob5;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		String inputstr = keyboard.nextLine();
		
		try{
			myTest(inputstr);
		}
		catch(MyException e) {
			System.out.println(e.toString());
		}
	}
	
	public static void myTest(String str) throws MyException{
		if(str.equals("null")) {
			throw new MyException("String value is null");
		}
		else {
			System.out.println("String value is " + str);
		}
	}
}
