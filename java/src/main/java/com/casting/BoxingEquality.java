package com.casting;

/*- @created 09-02-20

*/

public class BoxingEquality {
    public static void main(String... args) {

        for(int i = 200; i>0 ; i-=20) {        
            Integer i1 = i;
            Integer i2 = i;

            System.out.println("i1 = " + i1 + ", i1.hashCode = " + i1.hashCode());
            System.out.println("i2 = " + i2 + ", i2.hashCode = " + i2.hashCode());
            System.out.println();

            System.out.println("(i1 == i2) @ " + (i1 == i2));
            System.out.println("(i1 != i2) @ " + (i1 != i2));
            System.out.println("(i1.equals(i2)) @ " + (i1.equals(i2)));

            if(i1 == i2) System.out.println("same object");
            if(i1.equals(i2)) System.out.println("meaningfully equal");        

            Integer i3 = i/100;
            Integer i4 = i/100;

            System.out.println("i3 = " + i3 + ", i3.hashCode = " + i3.hashCode());
            System.out.println("i4 = " + i4 + ", i4.hashCode = " + i4.hashCode());        
            System.out.println();

            System.out.println("(i3 == i4) @ " + (i3 == i4));
            System.out.println("(i3 != i4) @ " + (i3 != i4));
            System.out.println("(i3.equals(i4)) @ " + (i3.equals(i4)));                
            
            if(i3 == i4) System.out.println("same object");
            if(i3.equals(i4)) System.out.println("meaningfully equal");

            System.out.println("#############################################################");

        }            

    }
}