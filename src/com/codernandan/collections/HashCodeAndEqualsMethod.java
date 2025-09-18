package com.codernandan.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeAndEqualsMethod {
    public static void main(String[] args) {
        // Creating a HashMap with custom Person keys
        HashMap<Person, String> map = new HashMap<>();
        Person p1 = new Person("Alice", 21);
        Person p2 = new Person("Bob", 18);
        Person p3 = new Person("Alice", 21); // same data as p1 but different object

        System.out.println("p1 hashCode: " + p1.hashCode());
        System.out.println("p2 hashCode: " + p2.hashCode());
        System.out.println("p3 hashCode: " + p3.hashCode());
        System.out.println("p1 equals p3 ? " + p1.equals(p3));

        // Putting entries in HashMap
        map.put(p1, "Engineer");  // Stored at index based on hash of p1
        map.put(p2, "Designer");  // Stored at index based on hash of p2
        map.put(p3, "Manager");   // Same data as p1: if equals/hashCode not overridden -> treated as different key

        System.out.println("\n--- Custom Person HashMap ---");
        for (Map.Entry<Person, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Because p1.equals(p3) is true (we overrode equals and hashCode),
        // p3 will replace p1's value in the map (not add a new entry)
        System.out.println("Value of p1: " + map.get(p1));
        System.out.println("Value of p3: " + map.get(p3));
        System.out.println("HashMap size (Person): " + map.size());

        // -------------------------------
        // Example with normal String keys
        // -------------------------------
        Map<String,Integer> map2 = new HashMap<>();
        map2.put("Shubham",90); // key "Shubham" -> 90
        map2.put("Neha",92);    // key "Neha" -> 92
        map2.put("Shubham",95); // same key -> replaces old value 90 with 95

        System.out.println("\n--- String Key HashMap ---");
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("HashMap size (String): " + map2.size());
    }

}

class Person {
    private String name;
    private int age;

    public Person(String name,int age){
        this.name = name;
        this.age = age;  // FIX: previously you forgot to set age
    }

    public String getName() {
        return name;
    }
    public Integer getAge() {
        return age;
    }

    // Generate hash based on name and age
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    // Two Person objects are equal if name and age are same
    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true; // same reference
        }
        if(obj == null || getClass() != obj.getClass()){
            return false;
        }
        Person other = (Person) obj;
        return age == other.getAge() && Objects.equals(name, other.getName());
    }

    @Override
    public String toString() {
        return  "Person [name: " + name + ", age: " + age + "]";
    }
}
