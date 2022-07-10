package Patterns;

import java.util.Scanner;

public class pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows: ");
        int n = sc.nextInt();
        for (int row = 0; row < n ; row++) {
            for (int spaces = 0; spaces < row; spaces++) {
                System.out.print(" ");
            }
            for (int number = 1; number <=n-row; number++) {
                System.out.print(row+1+" ");

            }
            System.out.println();
        }
    }
}
