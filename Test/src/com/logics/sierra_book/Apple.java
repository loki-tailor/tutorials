package com.logics.sierra_book;

/**
	@author = lokeshwar, created @ 16-12-19
	Exercise 1.1 from Sierra and Bates - OCA Java SE 8 Programmer I Exam Guide (Exams 1Z0-808)-1
	Demonstration of Abstract Class and overriding concerete and abstract methods

*/
import com.logics.sierra_book.food.Fruit;

class Apple extends Fruit {

	public void abstractDisplay() { System.out.println("Inside App overidden method"); };

	public static void main (String[] args) { nonAbstractDisplay(); new Apple().abstractDisplay(); }
}
