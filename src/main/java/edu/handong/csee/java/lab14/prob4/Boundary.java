package edu.handong.csee.java.lab14.prob4;

public class Boundary {
	//We use this variable to store the information that will be passed down
	private static int [] array = new int[5];
	//and we use count to track how many times we put in a number
	private static int count = 0;
	
	public void receive(int num) throws ArrayIndexOutOfBoundsException{
		//We set i to count so that we put in the numbers in order
		int i = count;
		//This line saves num into array[count]
		array[i] = num;
		//and then we increase count by 1 for the next time we receive a number
		count++;
		//finally we print out the process that we did by printing out the array[index] and what number we put into the array
		System.out.printf("arr[%d] <- %d\n", i, num);
	}
}
