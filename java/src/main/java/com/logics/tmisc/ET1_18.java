package com.logics.tmisc;

interface Bozo {
	int type = 0;

	public void jump();
}

public class ET1_18 implements Bozo {
	public ET1_18() {
		type = 20; // error: The final field Bozo.type cannot be assigned
	}

	public void jump() {
		System.out.println("jumping..." + type);
	}

	public static void main(String[] args) {
		ET1_18 o = new ET1_18();
		o.jump();
	}
}
