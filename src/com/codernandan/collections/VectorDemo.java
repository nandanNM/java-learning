package com.codernandan.collections;

import java.util.Arrays;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(5,3);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        System.out.println(vector.capacity());
        vector.add(1);
        System.out.println(vector.capacity());

        Vector<String> vector1 = new Vector<>(Arrays.asList("Monday", "Tuesday"));
        System.out.println(vector1);
        for (int i=0;i<vector1.size();i++){
            System.out.println(vector1.get(i));
        }

        for(String s: vector1){
            System.out.println(s);
        }
        vector1.clear();
        System.out.println(vector1);// []
    }
}

// Java Vector is a legacy, thread-safe, dynamically resizable array used when synchronized access is required.
// this can one thread access at a time for data safety.
// slower than ArrayList because all its methods are synchronized.: looking and unlooking cost