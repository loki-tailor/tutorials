package com.generics;

// ################################################################################
// ## simple generic class

class Create1 <T> {
	T t;
	public Create1() {}
	public Create1(T t) { this.t = t; }
}

// ################################################################################
// ## generic class with generic method taking generic type from class

class C2 <T> {
	public T good(T t) { return t; }
}

// ################################################################################
// ## generic method trying to take generic type from class, which does not specify the generict type


class C3 {
	// public T bad(T t) { return t; }
/* above will give below error:
.\com\generics\GMethds.java:14: error: cannot find symbol
        public T bad(T t) { return t; }
                     ^
  symbol:   class T
  location: class C3
.\com\generics\GMethds.java:14: error: cannot find symbol
        public T bad(T t) { return t; }
               ^
  symbol:   class T
  location: class C3
2 errors
*/

}
// ################################################################################
// ## static method will not take generic Type from class level
class C4 <T> {
	// public static T bad_static(T t) { return this.t; }
}

/*- above will give below error

PS F:\git\tutorials\java\src> javac .\com\generics\GMethds.java
.\com\generics\GMethds.java:43: error: non-static type variable T cannot be referenced from a static context
        public static T bad_static(T t) { return this.t; }
                                   ^
.\com\generics\GMethds.java:43: error: non-static type variable T cannot be referenced from a static context
        public static T bad_static(T t) { return this.t; }
                      ^
.\com\generics\GMethds.java:43: error: non-static variable this cannot be referenced from a static context
        public static T bad_static(T t) { return this.t; }
                                                 ^
.\com\generics\GMethds.java:43: error: cannot find symbol
        public static T bad_static(T t) { return this.t; }
                                                     ^
  symbol: variable t
4 errors

*/

// ################################################################################

// ## good static generic method in class
class C5<T> {
	public static <T> T good_static(T t) { return t; }
}


// ################################################################################

public class GMethds {

	public static <T> void prepare(T t) { System.out.println("Preparing " + t); }

	public <T> void doing(T t) { System.out.println("Doing " + t); }

	public static <T> Create1<T> perform(T t) { System.out.println("Performing " + t); return new Create1<>(); }

	public <T> T instance_method(T t) { return t; }

	public static void main(String[] args) {
	
		prepare("string"); prepare(10);

		GMethds g = new GMethds();
		
		g.doing(args); g.doing(new String("s"));

		GMethds.<String>prepare("this is string");
		GMethds.<Boolean>prepare(true);

		GMethds.<String[]>prepare(args);

		Create1 c = GMethds.<Integer>perform(200);
		Create1<Integer> c2 = GMethds.<Integer>perform(200);

		System.out.println("T in c2 = " + c2.t);
		
	}
}