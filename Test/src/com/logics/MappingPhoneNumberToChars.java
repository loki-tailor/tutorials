package com.logics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MappingPhoneNumberToChars {

    public static void main(String[] args) {
	String phoneNumber = "666-HAHA";
	Map aMap = new HashMap();
	aMap.put("[a-c]", "2");
	aMap.put("[d-f]", "3");
	aMap.put("[g-i]", "4");
	aMap.put("[j-l]", "5");
	aMap.put("[m-o]", "6");
	aMap.put("[p-s]", "7");
	aMap.put("[t-v]", "8");
	aMap.put("[w-z]", "9");
	phoneNumber = phoneNumber.toLowerCase();
	Iterator keys = aMap.keySet().iterator();
	while (keys.hasNext()) {
	    String regex = (String) keys.next();
	    String replacementValue = (String) aMap.get(regex);
	    phoneNumber = phoneNumber.replaceAll(regex, replacementValue);
	}
	System.out.println(phoneNumber);
    }

}
