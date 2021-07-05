package com.logics.t1;

class Point {
	int x;
	int y;

	void assign(int x, int y) {
		x = this.x;
		this.y = y;
	}

	public String toString() {
		return "Point(" + x + ", " + y + ")";
	}
}

public class _13_Test {
	public static void main(String[] args) {
		Point p1 = new Point();
		p1.x = 10;
		p1.y = 20;
		Point p2 = new Point();
		p2.assign(p1.x, p1.y);
		System.out.println(p1.toString() + ";" + p2.toString());
	}
}

/***
 * 
 * Explanation HINT: First check if members are accessible or not. All the codes
 * are in same file Test.java, and Point class & variable x, y are declared with
 * default modifier hence these can be accessed within the same package. Class
 * Test belongs to same package so no issues in accessing Point class and
 * instance variables of Point class. Make use of pen and paper to draw the
 * memory diagrams (heap and stack). It will be pretty quick to reach the
 * result.
 * 
 * 
 * 
 * Point p1 = new Point(); means p1.x = 0 and p1.y = 0 as instance variable are
 * initialized to respective zeros.
 * 
 * p1.x = 10; means replace 0 with 10 in p1.x,
 * 
 * p1.y = 20; means replace 0 with 20 in p1.y,
 * 
 * 
 * 
 * Point p2 = new Point(); means p2.x = 0 and p2.y = 0 as instance variable are
 * initialized to respective zeros.
 * 
 * p2.assign(p1.x, p1.y); invokes the assign method, parameter variable x = 10
 * and y = 20.
 * 
 * As assign is invoked on p2 reference variable hence this and p2 refers to
 * same Point object.
 * 
 * x = this.x; means assign 0 to parameter variable x, no changes in this.y,
 * which means p2.x is unchanged.
 * 
 * this.y = y; means assign 20 to this.y, which means p2.y is now 20
 * 
 * So after assign method is invoked and control goes back to main method: p1.x
 * = 10, p1.y = 20, p2.x = 0 and p2.y = 20.
 * 
 * Output is: Point(10, 20);Point(0, 20)
 * 
 */