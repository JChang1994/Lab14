package edu.handong.csee.java.lab14.prob6;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		//We use these variables to store user input
		String name, race;
		int age;
		//We need a CustomID object to interact with its methods
		CustomID custom = new CustomID();
		//We need a Scanner object to accept user input
		Scanner keyboard = new Scanner(System.in);
		//We need a boolean variable to continue to repeat the try catch block until we reach the final valid statement.
		boolean repeat = true;
		
		//This while loop will cause the try catch block to continue to repeat until all three variables name age and race 
		//are valid
		while(repeat) {
			//We use the try/catch block to try to setName/setAge/setRace and if there is an exception we catch it.
			try {
				//We use states to track at which variable the user is currently at. Once they input a valid state then we
				//increase state by one to get to the next variable
				if(custom.getState() == 0) {
					//prompt the user to input their name and then sets the name in CustomID using setName
					System.out.print("Enter your name: ");
					name = keyboard.nextLine();
					custom.setName(name);
				}
				else if(custom.getState() == 1) {
					//prompt the user to input their age and then sets the age in CustomID using setAge
					System.out.print("Enter your age: ");
					age = keyboard.nextInt();
					keyboard.nextLine();
					custom.setAge(age);
				}
				else if(custom.getState() == 2) {
					//prompt the user to input their race and then sets the race in CustomID using setRace
					System.out.print("Enter your race: ");
					race = keyboard.nextLine();
					custom.setRace(race);
					//If we reach this line that means that all three variables are valid and we should stop repeating
					//so we set the repeat variable to false.
					repeat = false;
				}
			}
			catch(Exception e){
				//If an exception is caught we will print out the message and then continue the program.
				System.out.println(e.getMessage());
				continue;
			}
		}
	}
}
