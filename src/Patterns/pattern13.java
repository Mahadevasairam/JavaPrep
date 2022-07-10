package Patterns;

import java.util.Scanner;

public class pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows: ");
        int n = sc.nextInt();
        for (int row = 1; row <=n ; row++) {
            for (int spaces = 0; spaces < n-row; spaces++) {
                System.out.print(" ");

            }
            for (int star = 0; star < n; star++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
