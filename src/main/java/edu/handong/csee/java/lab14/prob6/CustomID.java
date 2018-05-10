package edu.handong.csee.java.lab14.prob6;

public class CustomID {
	private String name;
	private int age;
	private String race;
	int state;
	
	public void setName(String name) throws Exception{
		if(name.length() < 5) {
			state = 0;
			throw new Exception("Your name is too short! Try again!");
		}
		else {
			this.name = name;
			System.out.println("Your name is valid.");
			System.out.println("Name: " + name);
			state++;
		}
	}
	
	public void setAge(int age) throws Exception{
		if(age < 18) {
			state = 1;
			throw new Exception("You are too young! Try again!");
		}
		else {
			this.age = age;
			System.out.println("Age is valid!");
			System.out.println("Age: " + age);
			state++;
		}
	}
	
	public void setRace(String race) throws Exception{
		if(race.equalsIgnoreCase("Vulcan") || race.equalsIgnoreCase("Romulan") || race.equalsIgnoreCase("Klingons")) {
			this.race = race;
			System.out.println("Race is valid!");
			System.out.println("Race: " + race);
		}
		else {
			throw new Exception("Not a valid race! Try again!");
		}
	}
	
	public int getState() {
		return this.state;
	}
}
