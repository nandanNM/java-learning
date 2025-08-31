package com.codernandan.firstcode.datatypes;

public class NarrowingConversionDemo {
    public static void main(String[] args) {
        double d = 123.456;
        // Output: (overflow!)
        float f = (float) d;   // double → float
        long l = (long) f;     // float → long
        int i = (int) l;       // long → int
        short s = (short) i;   // int → short
        byte b = (byte) s;     // short → byte

        int intValue = 97;
        char c = (char) intValue; // int → char

        System.out.println("Double value: " + d);
        System.out.println("Float value (from double): " + f);
        System.out.println("Long value (from float): " + l);
        System.out.println("Int value (from long): " + i);
        System.out.println("Short value (from int): " + s);
        System.out.println("Byte value (from short): " + b);

        System.out.println("Int value: " + intValue);
        System.out.println("Char value (from int): " + c);
    }
}
