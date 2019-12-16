package com.temp.food;

/**
	@author = lokeshwar, created @ 16-12-19
	Exercise 1.1 from Sierra and Bates - OCA Java SE 8 Programmer I Exam Guide (Exams 1Z0-808)-1
	Demonstration of Abstract Class and overriding concerete and abstract methods

*/

public abstract class Fruit {

	public static void nonAbstractDisplay() { System.out.println("method from fruit method"); }

	public abstract void abstractDisplay();

}
