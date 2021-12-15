package com.logics.tmisc;

import java.util.ArrayList;
import java.util.List;

public class ET1_42 {
	public static void main(String[] args) {
		Object o = new Integer(107);
		int i = (Integer) o.intValue() / 9; // invalid - compile error
//		int i = ((Integer) o).intValue() / 9; // correct

	}
}
