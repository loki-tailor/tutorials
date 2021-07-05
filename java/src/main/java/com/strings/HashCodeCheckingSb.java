package com.strings;

/*-
    @created 18-01-20
*/

public class HashCodeCheckingSb {
    public static void main(String[] args) {
        String s1 = "lokeshwar";
        String s2 = "lokeshwar";
        String s3 = "loki";

        StringBuffer sb1 = new StringBuffer("lokeshwarsb");
        StringBuffer sb2 = new StringBuffer("lokeshwarsb");
        StringBuffer sb3 = new StringBuffer("lokisb");
        StringBuffer sb4 = new StringBuffer("lokeshwar");

        StringBuilder sbui1 = new StringBuilder("lokeshwarsb");
        StringBuilder sbui2 = new StringBuilder("lokeshwarsb");
        StringBuilder sbui3 = new StringBuilder("lokisb");
        StringBuilder sbui4 = new StringBuilder("lokeshwar");

        System.out.println("\ns1 = " + s1 + " @ hashCode() = " + s1.hashCode());
        System.out.println("s2 = " + s2 + " @ hashCode() = " + s2.hashCode());
        System.out.println("s3 = " + s3 + " @ hashCode() = " + s3.hashCode());

        System.out.println("\nsb1 = " + sb1 + " @ hashCode() = " + sb1.hashCode());
        System.out.println("sb2 = " + sb2 + " @ hashCode() = " + sb2.hashCode());
        System.out.println("sb3 = " + sb3 + " @ hashCode() = " + sb3.hashCode());
        System.out.println("sb4 = " + sb4 + " @ hashCode() = " + sb4.hashCode());

        System.out.println("\nsbui1 = " + sbui1 + " @ hashCode() = " + sbui1.hashCode());
        System.out.println("sbui2 = " + sbui2 + " @ hashCode() = " + sbui2.hashCode());
        System.out.println("sbui3 = " + sbui3 + " @ hashCode() = " + sbui3.hashCode());
        System.out.println("sbui4 = " + sbui4 + " @ hashCode() = " + sbui4.hashCode());

    }
}

/*-
    OUTPUT:

    s1 = lokeshwar @ hashCode() = 1721443446
    s2 = lokeshwar @ hashCode() = 1721443446
    s3 = loki @ hashCode() = 3327521

    sb1 = lokeshwarsb @ hashCode() = 366712642
    sb2 = lokeshwarsb @ hashCode() = 1829164700
    sb3 = lokisb @ hashCode() = 2018699554
    sb4 = lokeshwar @ hashCode() = 1311053135

    sbui1 = lokeshwarsb @ hashCode() = 118352462
    sbui2 = lokeshwarsb @ hashCode() = 1550089733
    sbui3 = lokisb @ hashCode() = 865113938
    sbui4 = lokeshwar @ hashCode() = 1442407170
*/