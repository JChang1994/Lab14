package edu.handong.csee.java.lab14.prob2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InException {
	//We use x and y to track the user's input
	private int x = 0,y = 0;
	
	public void detectExeception() {
		try {
			//We need a Scanner to accept user input
			Scanner keyboard = new Scanner(System.in);
			//We prompt the user to input the data for x and y and then save it into the two variables respectively
			System.out.print("x: ");
			x = keyboard.nextInt();
			System.out.print("y: ");
			y = keyboard.nextInt();
			//Print out the values of x and y
			System.out.println(this.x/this.y);
		}
		//If an InputMismatchException occurs then we catch it with this catch block
		catch(InputMismatchException e){
			System.out.println("java.util.InputMismatchException has occurred");
		}
		//If an Arithmetic occurs then we catch it with this catch block
		catch(ArithmeticException e) {
			System.out.println("java.lang.ArithmeticException has occurred because: " + e.getMessage());
		}
		//If any other exception occurs then we use this last catch block to catch it
		catch(Exception e) {
			System.out.println("Some other exception has occurred: " + e.getMessage());
		}
	}
}
