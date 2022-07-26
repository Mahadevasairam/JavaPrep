package Patterns;

import java.util.Scanner;

public class pattern28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nn. of rows: ");
        int n = sc.nextInt();
        for (int row = 0; row < n; row++) {
            for (int spaces = 0; spaces < n - row; spaces++) {
                System.out.print(" ");
            }
            if (row == 0) System.out.print("*");
            else if (row == n / 2 ) {
                for (int star = 0; star <= row; star++) {
                    System.out.print("* ");
                }
            }
            else{
                System.out.print("* ");
                for (int space = 1; space <row; space++) {
                    System.out.print("  ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}