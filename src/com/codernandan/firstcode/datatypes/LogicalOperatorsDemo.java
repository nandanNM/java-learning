package com.codernandan.firstcode.datatypes;

public class LogicalOperatorsDemo {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println("a = " + a + ", b = " + b);

        // Logical AND
        System.out.println("a && b: " + (a && b)); // false
        System.out.println("a && true: " + (a && true)); // true

        // Logical OR
        System.out.println("a || b: " + (a || b)); // true
        System.out.println("b || false: " + (b || false)); // false

        // Logical NOT
        System.out.println("!a: " + (!a)); // false
        System.out.println("!b: " + (!b)); // true

        // Short-circuit behavior
        int x = 5;
        int y = 10;
        if (x < y && x++ < 10) {
            System.out.println("Inside AND condition");
        }
        System.out.println("x after AND check: " + x); // still 6

        if (y < x || y++ < 20) {
            System.out.println("Inside OR condition");
        }
        System.out.println("y after OR check: " + y); // still 10 (short-circuiting)
    }
}
