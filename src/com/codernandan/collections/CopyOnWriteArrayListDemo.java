package com.codernandan.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        // "Copy on write" means that whenever a write operation
        // like adding or removing an element
        // instead of directly modifying the existing list
        // a copy of the list is created, and the modification is applied to the copy
        // This ensures that other threads reading the list while it's being modified are unaffected.

        //Read Operations: Fast and direct, since they happen on a stable list without interference from modifications.
        // Write Operations: A new copy of the list is created for every modification.
        // The Reference to the list is then updated so that subsequent reads use this new list.

        // notepad  --> notepad-copy

        // read more  write less

        // not stable data
//        List<String> shoppingList = new ArrayList<>(); // ConcurrentModificationException error
        List<String> shoppingList = new CopyOnWriteArrayList<>(); // work -> one thread
        shoppingList.add("Milk");
        shoppingList.add("Potato");
        shoppingList.add("Coffee");
        shoppingList.add("Milk");
       for (String s : shoppingList){ // loop on copy
           System.out.println(s);
           if(s.equals("Milk")){
               shoppingList.add("Butter");
               System.out.println("Added Butter while reading.");
           }
       }
        System.out.println("Updated Shopping List:"+ shoppingList);

        List<String> sharedList = new CopyOnWriteArrayList<>();
        sharedList.add("Item1");
        sharedList.add("Item2");
        sharedList.add("Item3");
        Thread readerThread = new Thread(() -> {
            try {
                while (true) {
                    // Iterate through the list
                    for (String item : sharedList) {
                        System.out.println("Reading item: " + item);
                        Thread.sleep(100); // Small delay to simulate work
                    }
                }
            } catch (Exception e) {
                System.out.println("Exception in reader thread: " + e);
            }
        });
        Thread writerThread = new Thread(() -> {
            try {
                Thread.sleep(500); // Delay to allow reading to start first
                sharedList.add("Item4");
                System.out.println("Added Item4 to the list.");

                Thread.sleep(500);
                sharedList.remove("Item1");
                System.out.println("Removed Item1 from the list.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        readerThread.start();
        writerThread.start();
    }
}
