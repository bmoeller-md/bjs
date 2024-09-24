package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int i = 1;
        if (i == 2) {
            System.out.println("I = 2");
        }
		// System.out.println(concatenate("eins","Zwei"));
    }
	
	public static String concatenate(String one, String two){
        return one + two;
    }
}