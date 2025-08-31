package com.codernandan.firstcode.datatypes;

public class ArithmeticOperatorsDemo {
    public static void main(String[] args) {
        int a = 10, b = 3;

        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Addition (a + b): " + (a + b));
        System.out.println("Subtraction (a - b): " + (a - b));
        System.out.println("Multiplication (a * b): " + (a * b));
        System.out.println("Division (a / b): " + (a / b));
        System.out.println("Modulus (a % b): " + (a % b));

        // Increment & Decrement
        int x = 5;
        System.out.println("Original x: " + x);
        System.out.println("Post-increment (x++): " + (x++)); // prints 5, then x=6
        System.out.println("After post-increment: " + x);    // 6
        System.out.println("Pre-increment (++x): " + (++x)); // x=7 then prints 7

        int y = 5;
        System.out.println("Original y: " + y);
        System.out.println("Post-decrement (y--): " + (y--)); // prints 5, then y=4
        System.out.println("After post-decrement: " + y);    // 4
        System.out.println("Pre-decrement (--y): " + (--y)); // y=3 then prints 3

        float f1 = 10f / 3;        // 3.3333333
        float f2 = (float) 10 / 3; // 3.3333333
        float f3 = 10 / 3f;        // 3.3333333

    }
}
