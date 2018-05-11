package edu.handong.csee.java.lab14.prob1;

import java.util.Scanner;
import java.util.Random;

public class Main {
	public static void main(String args[]) {
		//We use these variables to track the speed and speed limit
		int speed, limit;
		//We need a Scanner to get the user's input
		Scanner keyboard = new Scanner(System.in);
		//We create a new Random object which will allow us to create a random speed to test
		Random rand = new Random();
		
		//Prompt the user to input the speed limit
		System.out.print("Set the speed limit officer ");
		//Save the user's input as the speed limit in the limit variable
		limit = keyboard.nextInt();
		//Randomize a speed so that we can test it against the speed limit
		speed = rand.nextInt(101);
		
		//Create a new SpeedLimiter object so that we can check if the user exceeds the speed limit or not.
		SpeedLimiter speedLimit = new SpeedLimiter(limit, speed);
		speedLimit.warnSpeedLimit();
	}
}
