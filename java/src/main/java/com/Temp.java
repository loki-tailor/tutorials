package com;

import java.util.ArrayList;
import java.util.List;

/*
 * created @ Sat Jul 03 2021 4:52:28 pm
 * ref @ 
 */


interface Drivable {}

class SUV implements Drivable {}

public class Temp {
	public static void main(String[] args) {
		ArrayList<Drivable> list = new ArrayList<>();
		SUV s = list.get(0);
	}

}