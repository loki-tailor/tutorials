package com.logics.t1._54.main;

import java.util.ArrayList;
import java.util.List;

public class main {
    static String main = "ONE";

    public main() {
        System.out.println("TWO");
    }

    public static void main(String[] args) {
        main();
    }

    public static void main() {
        System.out.println(main);
        List<String> s = new ArrayList<>();
        s.removeIf(s -> s.endsWith(".txt"));
    }
}
