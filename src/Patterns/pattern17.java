package Patterns;

import java.util.Scanner;

public class pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows: ");
        int n = sc.nextInt();
        for (int row = 1; row <= n ; row++) {
            for (int spaces = 0; spaces <n-row ; spaces++) {
                System.out.print(" ");
            }
            for (int star1 = 1; star1 <=2*row -1; star1++) {
                System.out.print("*");
            }
            System.out.println();

        }

        for (int row = n; row >=1 ; row--) {
            for (int spaces = 0; spaces <n-row ; spaces++) {
                System.out.print(" ");
            }
            for (int star1 = 1; star1 <=2*row -1; star1++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
