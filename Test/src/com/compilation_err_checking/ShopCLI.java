/**-
	created @ 29-03-20
	@author lokeshwar
	Practice of checking when "The method x() is undefined" and when "cannot find symbol comes" during compilation error
	SO: https://stackoverflow.com/questions/28660320/why-am-i-getting-the-error-the-method-is-undefined-for-the-type
**/

package com.compilation_err_checking;

import java.util.ArrayList;
import java.util.Scanner;

public class ShopCLI {

	public static void main(String[] args) {
		ArrayList<Order> ord = new ArrayList<>();
		
		System.out.println("Welcome to Sandwich Shop CLI V1!");
		System.out.println("Please choose and Option by Typing the Appropriate Number from the list");
		System.out.println("1.New Order");

		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();

		System.out.println("Please choose an outer form from the list:");
		System.out.println("Press 1 to continue or 2 to exit");
		int sandwich = sc.nextInt();

		if(sandwich == 1) {

			System.out.println("Outer Options are Bun, Bread or Brioche");
			String inputOuter = sc.next();

			System.out.println("Inner options are Ham, Cheese or Cucumber");
			String inputInner = sc.next();

			System.out.println("Sauce options are Mayo, Butter, or Marmite");
			String inputSauce = sc.next();

			ord.add(new Order(1, inputOuter, inputInner, inputSauce, 0));
			System.out.println("You Made a " + inputInner + " with " + inputSauce + " sandwich on " + inputOuter);
			System.out.println("That will cost you " + ord.get(0).getCost());
		} // end of if	
		else if (sandwich == 2)
			System.out.println("Exited...");
	} // end of main()
} // end of class

class Sandwich {
	// Fields
	ArrayList<Sandwich> sandwich = new ArrayList<>();
	String outer, inner, sauce;
	
	// Constructor
	public Sandwich(String outer, String inner, String sauce) {
		this.outer = outer;
		this.inner = inner;
		this.sauce = sauce;
	} // end of constructor

	// getter, setter
	public String getOuter() { return outer; }
	public String getInner() { return inner; }
	public String getSauce() { return sauce; } 
	public void setOuter(String outer) { this.outer = outer; }
	public void setInner(String inner) { this.inner = inner; }
	public void setSauce(String sauce) { this.sauce = sauce; }

	// reset order
	public void resetOrder() { sandwich.removeAll(sandwich); }
} // end of class Sandwich

class Order extends Sandwich {
	
	// fields
	int orderId;
	double cost;

	// Constructor
	public Order (int orderId, String outer, String inner, String sauce, double cost) {
		super(outer,inner,sauce);
		this.orderId = orderId;
		this.cost = cost;
		setOrder();
	} // end of constructor

	// getter, setter
	public int getOrderId() { return orderId; }
	public double getCost() { return cost; }
	public void setOrderId(int orderId) { this.orderId = orderId; }
	public void setCost(double cost) { this.cost = cost; }

	// methods
	public void setOrder() {

		double calCost = 0;
		double outerCost = 0.0;
		double innerCost = 0.0;
		double sauceCost = 0.0;

		// outer cost
		if(outer.equals("Bun")) {
			outerCost = 0.5;
		}
		else if (outer.equals("Bread")) {
			outerCost = 0.25;
		}
		else if (outer.equals("Brioche")) {
			outerCost = 0.75;
		} 
		else {
			System.out.println("Invalid bread type");
		}

		// inner cost
		if (inner.equals("Ham")) {
			innerCost = 0.5;
		}
		else if (inner.equals("Cheese")) {
			innerCost = 0.25;
		}
		else if (inner.equals("Cucumber")) {
			innerCost = 0.75;
		}
		else {
			System.out.println("Invalid Filling type");
		}

		// sauce cost
		if (sauce.equals("Mayo")) {
			sauceCost = 0.5;
		} 
		else if(sauce.equals("Butter")) {
			sauceCost = 0.25;
		} 
		else if (sauce.equals("Marmite")) {
			sauceCost = 0.75;
		}
		else {
			System.out.println("Invalid sauce type");
		}

		calCost = outerCost + innerCost + sauceCost;

		this.cost = calCost;
		
	} // end of method
} // end of class order	
