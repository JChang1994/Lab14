package edu.handong.csee.java.lab14.prob6;

public class CustomID {
	//We use these variables to save the user's input
	private String name;
	private int age;
	private String race;
	int state;
	
	//We use this method to set the users name
	public void setName(String name) throws Exception{
		//If the users name is shorter than 5 characters then we throw an exception and have the user try again
		if(name.length() < 5) {
			//We set the state back to the current state so that we repeat this block again
			state = 0;
			//We throw an exception with an error message telling the user that the name is too short
			throw new Exception("Your name is too short! Try again!");
		}
		//Otherwise we set the object's name to the name that was passed down
		else {
			//We set the objects name and then we add one to our state so that we can move on to the next variable
			this.name = name;
			System.out.println("Your name is valid.");
			System.out.println("Name: " + name);
			state++;
		}
	}
	//We use this method to set the users age
	public void setAge(int age) throws Exception{
		//If the users age is less than 18 then we throw an exception and have the user try again
		if(age < 18) {
			//We set the state back to the current state so that we repeat this block again
			state = 1;
			//We throw an exception with an error message telling the user that the age is too young
			throw new Exception("You are too young! Try again!");
		}
		//Otherwise we set the object's age to the age that was passed down
		else {
			//We set the objects age and then we add one to our state so that we can move on to the next variable
			this.age = age;
			System.out.println("Age is valid!");
			System.out.println("Age: " + age);
			state++;
		}
	}
	//We use this method to set the users race
	public void setRace(String race) throws Exception{
		//If the user is equal to any of these three races then we set the user's race, print out the race 
		//and finish out our program
		if(race.equalsIgnoreCase("Vulcan") || race.equalsIgnoreCase("Romulan") || race.equalsIgnoreCase("Klingons")) {
			this.race = race;
			System.out.println("Race is valid!");
			System.out.println("Race: " + race);
		}
		//Otherwise we throw an exception telling the user that it is not a valid race and have them try again.
		else {
			throw new Exception("Not a valid race! Try again!");
		}
	}
	//We use this method to get the current state of the CustomID object to check which variable we are currently on
	//name = 0 age = 1 race = 2
	public int getState() {
		return this.state;
	}
}
