package edu.handong.csee.java.lab14.prob6;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		String name, race;
		int age;
		CustomID custom = new CustomID();
		Scanner keyboard = new Scanner(System.in);
		boolean repeat = true;
		
		while(repeat) {
			try {
				if(custom.getState() == 0) {
					System.out.print("Enter your name: ");
					name = keyboard.nextLine();
					custom.setName(name);
				}
				else if(custom.getState() == 1) {
					System.out.print("Enter your age: ");
					age = keyboard.nextInt();
					keyboard.nextLine();
					custom.setAge(age);
				}
				else if(custom.getState() == 2) {
					System.out.print("Enter your race: ");
					race = keyboard.nextLine();
					custom.setRace(race);
					repeat = false;
				}
			}
			catch(Exception e){
				System.out.println(e.getMessage());
				continue;
			}
		}
	}
}
