package edu.handong.csee.java.lab14.prob1;

public class SpeedLimiter {
	//We use these variables to track speed and limit
	private int speed = 0;
	private int limit = 0;
	
	public SpeedLimiter(int limit, int speed) {
		//We take the variables that are passed down as parameters
		this.speed = speed;
		this.limit = limit;
	}
	
	public void warnSpeedLimit(){
		//We use try catch to try something and then catch an exception if it occurs.
		try {
			//If the speed is over the limit then we throw an exception
			if(this.speed > this.limit)
					throw new Exception("Speed Limit " + this.limit + "kmph exceeded!");
			//Otherwise the system will print out a message that the user is under the limit.
			System.out.println("You are a law abiding citizen!");
		}
		catch(Exception e){
			//e.getMessage passes the message that we set earlier and we print it out.
			System.out.println(e.getMessage());
			System.out.println("You are getting fined!");
		}	
		//Print out the user's speed
		System.out.println("Your current speed: " + this.speed);
	}
}
