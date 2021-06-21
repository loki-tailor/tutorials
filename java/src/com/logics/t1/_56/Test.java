package com.logics.t1._56;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {

}

class C1 implements I1 {
    @Override
    public void m1() {
    }
}

class C2 implements I1 {
    @Override
    public void m1() throws IOException {
    }
}

class C3 implements I1 {
    @Override
    public void m1() throws FileNotFoundException {
    }
}

class C4 implements I1 {
    @Override
    public void m1() throws Exception {
    }
}

/*--

 
class C3 implements I1 {
    public void m1() throws java.io.IOException{}
}
 
public class Test {
    public static void main(String[] args) {
        I1 obj = new C3();
        obj.m1(); //Compilation error, IOException needs to be handled as obj is of I1 type.
        
        C3 c3 = new C3();
        c3.m1(); //Compilation error, IOException needs to be handled as c3 is of C3 type.
    }
}
Class C3 correctly implements I1 and at the time of invocation, whether you use reference variable of I1 type or C3 type, IOException needs to be handled.



3. May declare to throw the sub class of the exception thrown by super class / interface method,

interface I1 {
    void m1() throws java.io.IOException;
}
 
class C2 implements I1 {
    public void m1() throws java.io.FileNotFoundException{}
}
 
public class Test {
    public static void main(String[] args) {
        I1 obj = new C2();
        obj.m1(); //Compilation error, IOException needs to be handled as obj is of I1 type.
        
        C2 c2 = new C2();
        c2.m1(); //Compilation error, FileNotFoundException needs to be handled as c2 is of C2 type.
    }
}
Class C2 correctly implements I1 and at the time of invocation, if you use reference variable of I1 type, then IOException needs to be handled as obj is of It type and if you use reference variable of C2 type, then FileNotFoundException needs to be handled as c2 is of C2 type.



4. Cannot declare to throw the super class of the exception thrown by super class / interface method

interface I1 {
    void m1() throws java.io.IOException;
}
 
class C4 implements I1 {
    public void m1() throws Exception{} //Compilation error as overriding method cannot declare to throw super type of IOException
}
And as question is expecting code incorrectly implementing interface I1, hence option containing class C4 is the correct one.



Hope this helps.

Regards,

Udayan

*/
