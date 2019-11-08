package com.telrun;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter operation number");
        System.out.println("1 - addition");
        System.out.println("2 - subtraction");
        System.out.println("3 - multiplication");
        System.out.println("4 - division");

        Scanner scanner = new Scanner(System.in);
        int operation = scanner.nextInt();

        while (operation < 1 || operation >4) {
            System.out.println("Enter another number ");
            operation = scanner.nextInt() ;
        }

        System.out.println("Enter first number");
        int a = scanner.nextInt();

        System.out.println("Enter second number");
        int b = scanner.nextInt();
        double result = 0;

        if (operation == 1) {
            result = a + b;
        }
        else if (operation == 2) {
            result = a - b;
        }
        else if (operation == 3) {
            result = a * b;
        }
         else {
            if (b == 0) {
                while (b == 0) {
                    System.out.println(" Enter another number");
                    b = scanner.nextInt();
                }
                result = a / b;
            }
            else {
                result = a / b;
            }
        }
        System.out.println("Result is: " + result);
    }
    
}
