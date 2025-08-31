package com.codernandan.firstcode.datatypes;

public class Test {
    public static void main(String[] args) {
        System.out.println("Byte Range:");
        byte b = 127;
        System.out.println("Example byte value: " + b);
        System.out.println("Minimum byte value: " + Byte.MIN_VALUE);
        System.out.println("Maximum byte value: " + Byte.MAX_VALUE);
        System.out.println();

        // Short
        System.out.println("Short Range:");
        short s = 32767;
        System.out.println("Example short value: " + s);
        System.out.println("Minimum short value: " + Short.MIN_VALUE);
        System.out.println("Maximum short value: " + Short.MAX_VALUE);
        System.out.println();

        // Int
        System.out.println("Int Range:");
        int i = 2147483647;
        System.out.println("Example int value: " + i);
        System.out.println("Minimum int value: " + Integer.MIN_VALUE);
        System.out.println("Maximum int value: " + Integer.MAX_VALUE);
        System.out.println();

        // Long
        System.out.println("Long Range:");
        long l = 9223372036854775807L;
        System.out.println("Example long value: " + l);
        System.out.println("Minimum long value: " + Long.MIN_VALUE);
        System.out.println("Maximum long value: " + Long.MAX_VALUE);
        System.out.println();

        // Float
        System.out.println("Float Range:");
        float f = 3.14f;
        System.out.println("Example float value: " + f);
        System.out.println("Minimum float value: " + Float.MIN_VALUE);
        System.out.println("Maximum float value: " + Float.MAX_VALUE);
        System.out.println();

        // Double
        System.out.println("Double Range:");
        double d = 3.14159265359;
        System.out.println("Example double value: " + d);
        System.out.println("Minimum double value: " + Double.MIN_VALUE);
        System.out.println("Maximum double value: " + Double.MAX_VALUE);
        System.out.println();

        // Char
        System.out.println("Char Range:");
        char c = 'A';
        System.out.println("Example char value: " + c);
        System.out.println("Minimum char value (as int): " + (int) Character.MIN_VALUE);
        System.out.println("Maximum char value (as int): " + (int) Character.MAX_VALUE);
        System.out.println();

        // Boolean
        System.out.println("Boolean Values:");
        boolean boolTrue = true;
        boolean boolFalse = false;
        System.out.println("Example true value: " + boolTrue);
        System.out.println("Example false value: " + boolFalse);

    }
}
