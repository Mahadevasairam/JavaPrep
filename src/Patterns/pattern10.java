package Patterns;

import java.util.Scanner;

public class pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows: ");
        int n = sc.nextInt();
        for (int row = 0; row < n; row++) {
            for (int spaces = 0; spaces < n-row-1; spaces++) {
                System.out.print("  ");
            }
            for (int stars = 0; stars <= row; stars++) {
                System.out.print("*   ");
            }
            System.out.println();
        }
        }
    }
