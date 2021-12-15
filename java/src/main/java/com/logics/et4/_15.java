package com.logics.et4;


interface Runner { public void run(); }

interface Runner2 { public int run(); }

public class _15 {
	
	public static void main(String[] args) {
		run( () -> voidMethod()); // will invoke 'runner' method
		
		run(() -> intMethod()); // will invoke 'runner2' if that method+arg is there, else will invoke simply 'runner' method
	}
	
	public static void run(Runner x) { System.out.println("in runner"); x.run(); }
	
	public static void run(Runner2 x) { System.out.println("in runner2"); x.run(); }
	
	public static void voidMethod() { System.out.println("voidMethod"); }
	
	public static int intMethod() { System.out.println("intMethod"); return 0; }

}
