package com.codernandan.firstcode.datatypes;

public class LoopsDemo {
    public static void main(String[] args) {

        // 1. for loop
        System.out.println("for loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("  i = " + i);
        }

        // 2. while loop
        System.out.println("\nwhile loop:");
        int j = 1;
        while (j <= 5) {
            System.out.println("  j = " + j);
            j++;
        }

        // 3. do-while loop
        System.out.println("\ndo-while loop:");
        int k = 1;
        do {
            System.out.println("  k = " + k);
            k++;
        } while (k <= 5);

        // 4. enhanced for loop (for-each)
        System.out.println("\nfor-each loop:");
        int[] numbers = {10, 20, 30, 40, 50};
        for (int num : numbers) {
            System.out.println("  num = " + num);
        }

        // 5. break statement
        System.out.println("\nbreak in loop:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break; // stop the loop when i = 3
            }
            System.out.println("  i = " + i);
        }

        // 6. continue statement
        System.out.println("\ncontinue in loop:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // skip the iteration when i = 3
            }
            System.out.println("  i = " + i);
        }
    }

}
