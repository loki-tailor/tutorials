package com.operators;

/*- @created 14-10-2020

https://stackoverflow.com/questions/2315705/what-is-the-difference-between-i-i-in-a-for-loop#:~:text=Both%20increment%20the%20number%2C%20but,after%20the%20expression%20is%20evaluated.&text=When%20I%20compare%20the%20two,that%20the%20two%20are%20identical.

https://coderanch.com/t/246180/certification/short-circuit

https://coderanch.com/t/551297/certification/conditional-operator-precedence

https://coderanch.com/t/321688/java/jls-order-evaluation

https://coderanch.com/t/195188/certification/jls-order-Evaluation

*/
public class OperatorPrecedenceDemo {
	static boolean a,b,c;
	public static void main(String[] args) {

		boolean x = (a=true) || (b=true) && (c=true);
		System.out.println("x = " + x + ", (a=true) || (b=true) && (c=true)" + "\t" + a + " " + b + " " + c);
		a=false; b=false; c=false; x=false;

		x = (a=false) || (b=true) && (c=true);
		System.out.println("x = " + x + ", (a=false) || (b=true) && (c=true)" + "\t" + a + " " + b + " " + c);
		a=false; b=false; c=false; x=false;

		x = (a=false) || (b=false) && (c=true);
		System.out.println("x = " + x + ", (a=false) || (b=false) && (c=true)" + "\t" + a + " " + b + " " + c);
		a=false; b=false; c=false; x=false;

		x = (a=false) || (b=false) && (c=false);
		System.out.println("x = " + x + ", (a=false) || (b=false) && (c=false)" + "\t" + a + " " + b + " " + c);
		a=false; b=false; c=false; x=false;

		x = (a=true) || (b=false) && (c=false);
		System.out.println("x = " + x + ", (a=true) || (b=false) && (c=false)" + "\t" + a + " " + b + " " + c);
		a=false; b=false; c=false; x=false;

		x = (a=true) || (b=true) && (c=false);
		System.out.println("x = " + x + ", (a=true) || (b=true) && (c=false)" + "\t" + a + " " + b + " " + c);
		a=false; b=false; c=false; x=false;

		x = (a=true) || (b=false) && (c=true);
		System.out.println("x = " + x + ", (a=true) || (b=false) && (c=true)" + "\t" + a + " " + b + " " + c);
		a=false; b=false; c=false; x=false;

		x = (a=false) || (b=true) && (c=false);
		System.out.println("x = " + x + ", (a=false) || (b=true) && (c=false)" + "\t" + a + " " + b + " " + c);
		a=false; b=false; c=false; x=false;
	}
}