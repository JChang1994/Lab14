package edu.handong.csee.java.lab14.prob3;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		//We need a Scanner to accept the user input
		Scanner keyboard = new Scanner(System.in);
		//We need a Powercalc object so that we can interact with its methods
		Powercalc calc = new Powercalc();
		
		//This while checks if the user is inputting information
		while(keyboard.hasNextInt()) {
			//We store the users input in n and p
			int n = keyboard.nextInt();
			int p = keyboard.nextInt();
			//We use this try and catch block to try the calculation and if the power method throws an exception
			//then we catch it with the catch block and print out the error message.
			try {
				System.out.println(calc.power(n, p));
			}
			catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
