package edu.handong.csee.java.lab14.prob3;

public class Powercalc {
	public long Power(int n, int p) throws Exception{
		long result = 0;
		
		if(n < 0 || p < 0) {
			throw new Exception("n or p should not be negative");
		}
		if(n == 0 && p == 0)
		{
			throw new Exception("n and p should not be zero");
		}
		
		result = (long)Math.pow(n, p);
		return result;
	}
}
