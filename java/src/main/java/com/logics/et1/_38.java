package com.logics.et1;

class Super {}
class Sub extends Super {}

public class _38 {
	public static void main(String[] args) {
		Super s1 = new Super(); 
		Sub s2 = new Sub();
		s1 = (Super) s2;
	}
}
