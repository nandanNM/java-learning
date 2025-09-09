package com.codernandan.collections;

import java.sql.Array;
import java.util.*;

public class Test {
    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("Monday", "Tuesday"); // we don't add new data
        System.out.println(list1.getClass().getName());
        list1.set(1, "Wednesday");
        System.out.println(list1.get(1));

        String[] array = {"Apple", "Banana", "Cherry"};
        List<String> list2 = Arrays.asList(array);
        System.out.println(list2.getClass().getName());

        List<String> list4 = new ArrayList<>(list2);
        list4.add("Mango");
        System.out.println(list4);
        List<Integer> list5 = new ArrayList<>(6);
        list5.add(1);
        list5.add(2);
        list5.add(3);
        list5.add(4);
        list5.add(5);
        list5.add(6);
        list5.add(7);
        list5.remove(6);
        System.out.println(list5);
        String[] array1 = {"Apple", "Banana", "Cherry"};
        String[] array2  = new String[2];
        array2[0] = "Monday";
        array2[1] = "Tuesday";
        System.out.println(Arrays.toString(array2));

        String[] fruits = {"Apple", "Banana", "Cherry"};

        List<String> fruitList = Arrays.asList(fruits);

//        fruitList.add("Orange");//

        List<String> resizableList = new ArrayList<>(Arrays.asList(fruits));// that changeable
        resizableList.add("Orange");
        System.out.println(resizableList);


        ArrayList<String> list6 = new  ArrayList<>();
    }
}
