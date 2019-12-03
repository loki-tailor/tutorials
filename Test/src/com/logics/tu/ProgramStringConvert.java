package com.logics.tu;

public class ProgramStringConvert {

    public String fromDefaultLanguage(String languageTokens) {
	String s = "";
	for (int i = 0; i < languageTokens.length(); i++) {
	    s = s + (char) (languageTokens.charAt(i) + 3);
	}
	return s;
    }

    public String toDefaultLanguage(String languageTokens) {
	String s = "";
	for (int i = 0; i < languageTokens.length(); i++) {
	    s = s + (char) (languageTokens.charAt(i) - 3);
	}
	return s;
    }

    public static void main(String[] args) {
	ProgramStringConvert psc = new ProgramStringConvert();
	System.out.println(psc.fromDefaultLanguage("Java"));
	System.out.println(psc.toDefaultLanguage("def"));
	String s = "java";
	System.out.println((char) (s.charAt(0) + 3));

    }

}
