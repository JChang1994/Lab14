package edu.handong.csee.java.lab14.prob2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InException {
	private int x = 0,y = 0;
	
	public void detectExeception() {
		try {
			Scanner keyboard = new Scanner(System.in);
			System.out.print("x: ");
			x = keyboard.nextInt();
			System.out.print("y: ");
			y = keyboard.nextInt();
			System.out.println(this.x/this.y);
		}
		catch(InputMismatchException e){
			System.out.println("java.util.InputMistmathException has occurred");
		}
		
		catch(ArithmeticException e) {
			System.out.println("java.lang.ArithmeticException has occurred because: " + e.getMessage());
		}
		catch(Exception e) {
			System.out.println("Some other exception has occurred: " + e.getMessage());
		}
	}
}
