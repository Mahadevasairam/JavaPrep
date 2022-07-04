package com.company;

import java.util.Scanner;

public class EvenSum {
    public static boolean isEven(int i) {
        return i > 0 && i % 2 == 0;
    }

    public static void sumEven(int a, int b) {
        int sum = 0;
        if (a <= b) {
            for (int i = a; i <= b; i++) {
                if (isEven(i)) {
                    sum = sum + i;

                }


            }
            System.out.println("Sum of Even numbers are:"+sum);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start Range: ");
        int a = sc.nextInt();
        System.out.print("Enter End Range: ");
        int b = sc.nextInt();
        sumEven(a,b);
    }
}
