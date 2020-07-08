package com.enums.demo2;

import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {

	Device d = new Device();

	Field declaredField = d.getClass().getDeclaredField("configApi");

    }

}
