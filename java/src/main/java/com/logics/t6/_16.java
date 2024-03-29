package com.logics.t6;

import java.io.FileNotFoundException;
import java.io.IOException;

abstract class Super {
    public abstract void m1() throws IOException;
}

class Sub extends Super {
    @Override
    public void m1() throws IOException {
        throw new FileNotFoundException();
    }
}

public class _16 {
    public static void main(String[] args) {
        Super s = new Sub();
        
        try { s.m1(); } 

        catch(FileNotFoundException e) { e.printStackTrace(); }
        
        catch(IOException e) { e.printStackTrace(); }

        finally { System.out.println("this is finally"); }
    }
}
