package com.time;

import java.time.Period; 

public class PeriodTralNerr {
        public static void main(String[] args) {
    
            System.out.println(Period.parse("+P1Y")); // P1Y
            
            System.out.println(Period.parse("-p1y")); // P-1Y
            
            // System.out.println(Period.parse("p1yy")); // java.time.format.DateTimeParseException:
    
            // System.out.println(Period.parse("1P2Y")); // java.time.format.DateTimeParseException:
    
            System.out.println(Period.parse("-p0y")); // P0D
    
            // System.out.println(Period.parse("-p2M1y")); // java.time.format.DateTimeParseException:
    
            // System.out.println(Period.parse("P0M1Y")); // java.time.format.DateTimeParseException:
    
            // System.out.println(Period.parse("P")); // java.time.format.DateTimeParseException:
    
            // System.out.println(Period.parse("-P1")); // java.time.format.DateTimeParseException:
    
            System.out.println(Period.parse("P1W")); // P7D
    
            // System.out.println(Period.parse("P1W1M")); //  java.time.format.DateTimeParseException:
    
            // System.out.println(Period.parse("P1M1D1W")); // java.time.format.DateTimeParseException:
    
            System.out.println(Period.parse("P1M1W1D")); // P1M8D
    
            // System.out.println(Period.parse("P1Y1Y")); //  java.time.format.DateTimeParseException:
            
        }
    }