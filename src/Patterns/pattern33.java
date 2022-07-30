package Patterns;

import java.util.Scanner;

public class pattern33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        for (int row = 1; row <= n; row++) {
            for (int num1 = 1; num1 <= row; num1++) {
                System.out.print(num1);
            }
            for (int space = 0; space < n-row; space++) {
                System.out.print("  ");
            }
            for (int num2 = row ; num2 > 0 ; num2--) {
                System.out.print(num2);
            }
            System.out.println();
        }

    }
}
