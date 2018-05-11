package edu.handong.csee.java.lab14.prob4;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		//We need a Scanner object to accept user input
		Scanner keyboard = new Scanner(System.in);
		//We save the user's input in the num variable
		int num = 0;
		//We need a Boundary object to interact with its methods
		Boundary array = new Boundary();
		//We need a boolean variable so that we can continue to repeat the try/catch block until we reach an exception
		boolean repeat = true;
		
		//This while loop will continue to repeat the try/catch block until we reach the out of bounds exception
		while(repeat) {
			try {
				//Prompts the user to input an integer and then saves it into num and adds it to the array using
				//the Boundary object.
				System.out.print("Enter an integer: ");
				num = keyboard.nextInt();
				array.receive(num);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				//Prints out that the array index was out of bounds and stops the while loop by setting repeat to false.
				System.out.println("Invalid array index access!");
				repeat = false;
			}
		}
		
	}
}
