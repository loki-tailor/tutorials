package com.flow_controls;
/*
 * created @ Tue May 18 2021 11:11:54 pm
 * ref @ OCAJP Sierra Book @ page 
 */

import java.util.ArrayList;
import java.util.List;

public class SwitchEffectiveFinalVar {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(100);

        Integer DEFAULT_NUM = 0;
        list.forEach(a -> {
            switch (DEFAULT_NUM) {
                case 1:
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("2");
                    break;
                default:
                    System.out.println("default");
                    break;
            }
            // DEFAULT_NUM = 1; // compile error
            System.out.println("next turn...");
        });
    }
}
