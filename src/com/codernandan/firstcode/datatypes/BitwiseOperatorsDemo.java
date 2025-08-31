package com.codernandan.firstcode.datatypes;

public class BitwiseOperatorsDemo {
    public static void main(String[] args) {
        int a = 5;   // 0101
        int b = 3;   // 0011

        System.out.println("a = " + a + " (" + Integer.toBinaryString(a) + ")");
        System.out.println("b = " + b + " (" + Integer.toBinaryString(b) + ")");

        System.out.println("a & b (AND): " + (a & b));  // 1
        System.out.println("a | b (OR): " + (a | b));  // 7
        System.out.println("a ^ b (XOR): " + (a ^ b)); // 6
        System.out.println("~a (NOT): " + (~a));       // -6

        System.out.println("a << 1 (Left shift): " + (a << 1));   // 10
        System.out.println("a >> 1 (Right shift): " + (a >> 1));  // 2
        System.out.println("a >>> 1 (Unsigned right shift): " + (a >>> 1)); // 2
    }
}
