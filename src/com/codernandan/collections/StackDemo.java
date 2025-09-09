package com.codernandan.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        stack.push("e");
        System.out.println(stack);
        String removeElement = stack.pop();
        System.out.println(removeElement);
        System.out.println(stack);
        System.out.println(stack.peek());//
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        stack.add(4,"k");
        stack.search("c");


        // LinkedList as a Stack is used in a single-threaded environment.
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(4);

        linkedList.getLast();// peek
        linkedList.removeLast(); // pop

        // ArrayList as Stack ?
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.get(arrayList.size() - 1);// peek
        arrayList.remove(arrayList.size() - 1);// pop

    }
}

// LIFO:  Last in Fast Out // all vector property hare