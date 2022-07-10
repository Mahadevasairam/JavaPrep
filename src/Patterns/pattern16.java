package Patterns;

import java.util.Scanner;

public class pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows: ");
        int n = sc.nextInt();
        for (int row = 1; row <=n ; row++) {
            for (int spaces = 0; spaces < n-row; spaces++) {
                System.out.print(" ");
            }
            for (int number1 = row; number1>=1; number1--) {
                System.out.print(number1);
            }
            for (int number2 = 2; number2 <= row ; number2++) {
                System.out.print(number2);

            }
            System.out.println();
        }
    }
}
