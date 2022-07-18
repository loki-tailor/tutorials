package com.consume_cli_args;
// ref - https://lightrun.com/java/java-tutorial-java-command-line-arguments/
public class UsingSystemProp {
    public static void main(String[] args) {
        System.out.println("name = " + System.getProperty("name"));
        System.out.println("surname = " + System.getProperty("surname"));
    }
}
