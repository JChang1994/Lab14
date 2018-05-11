package edu.handong.csee.java.lab14.prob3;

public class Powercalc {
	public long power(int n, int p) throws Exception{
		//We use this variable to record the result of the calculation
		long result = 0;
		//if n or p is less than 0 which means they are negative we throw an exception with the error message
		//that the two variables should not be negative
		if(n < 0 || p < 0) {
			throw new Exception("n or p should not be negative");
		}
		//if both n and p are equal to 0 then we throw an exception with the error message that the two
		//variables should not be 0
		if(n == 0 && p == 0)
		{
			throw new Exception("n and p should not be zero");
		}
		//If the calculation passes through the two possible exceptions then we calculate it and return the result
		result = (long)Math.pow(n, p);
		return result;
	}
}
