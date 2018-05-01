package edu.handong.csee.java.lab14.prob1;

public class SpeedLimiter {
	private int speed = 0;
	private int limit = 0;
	
	public SpeedLimiter(int limit, int speed) {
		this.speed = speed;
		this.limit = limit;
	}
	
	public void warnSpeedLimit(){
		try {
			if(this.speed > this.limit)
					throw new Exception("Speed Limit " + this.limit + "kmph exceeded!");
			System.out.println("You are a law abiding citizen!");
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println("You are getting fined!");
		}	
		System.out.println("Your current speed: " + this.speed);
	}
}
