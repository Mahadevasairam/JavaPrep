package Patterns;

import java.util.Scanner;

public class pattern27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nn. of rows: ");
        int n = sc.nextInt();
        for (int row = n; row > n/2; row--) {
            for (int space = 0; space < 2*(n-row); space++) {
                System.out.print(" ");
            }
            System.out.print("* ");
            for (int space1 = 0; space1 < n-row ; space1++) {
                System.out.print(" ");
            }
            System.out.print(" *");
            System.out.println();
        }

    }
}
