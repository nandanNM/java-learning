package com.codernandan.firstcode.datatypes;

public class WideningConversionDemo {
    public static void main(String[] args) {
        byte b = 10;              // 1 byte
        short s = b;              // byte → short
        int i = s;                // short → int
        long l = i;               // int → long
        float f = l;              // long → float
        double d = f;             // float → double

        char c = 'A';             // char → int (Unicode value 65)
        int charToInt = c;

        System.out.println("Byte value: " + b);
        System.out.println("Short value (from byte): " + s);
        System.out.println("Int value (from short): " + i);
        System.out.println("Long value (from int): " + l);
        System.out.println("Float value (from long): " + f);
        System.out.println("Double value (from float): " + d);

        System.out.println("Char value: " + c);
        System.out.println("Int value (from char): " + charToInt);
    }
}
