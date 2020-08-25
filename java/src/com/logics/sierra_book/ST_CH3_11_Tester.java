/*-
	@created 25/08/2020
	
	Q = When line 16 is reached, how many objects will be eligible for garbage collection?
	
	
	x - 0
		v - 1
	x - 2
	x - 3
	x - 4
	x - 5
	
	
	Note: it should be clear that there is still reference to the object referred to by a2, and that there is still a reference to the object referred by a2.b2. What might be less clear is that you can still access the other Beta object through the static variable a2.b1 - because its a static. 
	
*/

class Beta { }

class Alpha { 
	static Beta b1;
	Beta b2;	
}

public class Tester {
	public static void main(String [] args) {
		Beta b1 = new Beta();  Beta b2 = new Beta();
		Alpha a1 = new Alpha(); Alpha a2 = new Alpha();
		a1.b1 = b1;
		a1.b2 = b1;
		a2.b2 = b2;
		a1 = null; b1 = null; b2 = null;
		// do stuff, line 16
	} 
}


