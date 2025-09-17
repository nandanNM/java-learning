package com.codernandan.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Nandan"); // Time O(n) time complexity
        map.put(3,"Shubham");
        map.put(2,"Neha");
//        map.put(null,"Ram");

//      map.put(2,"Shubham"); // Replace data

        System.out.println(map);

        String student = map.get(3);
        System.out.println(student);

        String s =  map.get(10);
        System.out.println(s);

        System.out.println(map.containsKey(2)); // O(1) time complexity // in set O(n) time complexity
        System.out.println(map.containsValue("Shubham"));

        Set<Integer> keys =  map.keySet();
        for(int i : keys){
            System.out.println(map.get(i));
        }

       Set<Map.Entry<Integer, String>> entries =  map.entrySet();

        for(Map.Entry<Integer, String> entry : entries){
            System.out.println(entry.getKey()+ ": " + entry.getValue());
            entry.setValue(entry.getValue().toUpperCase());
        }

//        map.remove(3);
        boolean res = map.remove(3,"Sam");
        System.out.println("REMOVE ? " + res);


    }
}
