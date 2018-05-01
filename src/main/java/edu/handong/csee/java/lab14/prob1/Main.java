package edu.handong.csee.java.lab14.prob1;

import java.util.Scanner;
import java.util.Random;

public class Main {
	public static void main(String args[]) {
		int speed, limit;
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("Set the speed limit officer ");
		limit = keyboard.nextInt();
		speed = rand.nextInt(101);
		
		SpeedLimiter speedLimit = new SpeedLimiter(limit, speed);
		speedLimit.warnSpeedLimit();
	}
}
