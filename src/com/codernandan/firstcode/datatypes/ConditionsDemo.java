package com.codernandan.firstcode.datatypes;

public class ConditionsDemo {
    public static void main(String[] args) {

        // 1. if statement
        int age = 20;
        if (age >= 18) {
            System.out.println("if: You are an adult.");
        }

        // 2. if-else statement
        int age2 = 16;
        if (age2 >= 18) {
            System.out.println("if-else: You are an adult.");
        } else {
            System.out.println("if-else: You are a minor.");
        }

        // 3. if-else-if ladder
        int marks = 75;
        if (marks >= 90) {
            System.out.println("if-else-if: Grade A");
        } else if (marks >= 75) {
            System.out.println("if-else-if: Grade B");
        } else if (marks >= 50) {
            System.out.println("if-else-if: Grade C");
        } else {
            System.out.println("if-else-if: Fail");
        }

        // 4. Nested if
        int number = 25;
        if (number > 0) {
            if (number % 2 == 0) {
                System.out.println("nested if: Positive Even");
            } else {
                System.out.println("nested if: Positive Odd");
            }
        }

        // 5. switch statement
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("switch: Monday");
                break;
            case 2:
                System.out.println("switch: Tuesday");
                break;
            case 3:
                System.out.println("switch: Wednesday");
                break;
            default:
                System.out.println("switch: Invalid day");
        }

        // 6. ternary operator
        int age3 = 18;
        String result = (age3 >= 18) ? "Adult" : "Minor";
        System.out.println("ternary: " + result);
    }
}
