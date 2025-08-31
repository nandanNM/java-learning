package com.codernandan.firstcode.datatypes;

public class StringObjectsDemo {
    public static void main(String[] args) {
        int a = 1; // Store in stack
        // String literal
        String s1 = "Java";
        String s2 = "Java"; // refers to same object in string pool

        // String object using 'new' create in heep
        String s3 = new String("Java");
        String s4 = new String("Java");

        System.out.println("s1 == s2 : " + (s1 == s2));   // true (same pool object)
        System.out.println("s1 == s3 : " + (s1 == s3));   // false (different object)
        System.out.println("s3 == s4 : " + (s3 == s4));   // false (different objects)

        System.out.println("s1.equals(s3) : " + s1.equals(s3)); // true (content is same)

        // Common String methods
        String text = "Hello World";
        System.out.println("Length: " + text.length());
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
        System.out.println("Substring (0-5): " + text.substring(0, 5));
        System.out.println("Character at index 1: " + text.charAt(1));
    }
}
