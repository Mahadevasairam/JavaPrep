package Patterns;

import java.util.Scanner;

public class pattern20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows: ");
        int n = sc.nextInt();
        for (int row = 1; row <= n; row++) {
            for (int spaces = 0; spaces < n - row ; spaces++) {
                System.out.print(" ");
            }
            for (int alpha = 1; alpha <= row; alpha++) {
                System.out.print((char)(alpha+64)+" ");
            }
            System.out.println();
        }
        for (int row = n-1; row >= 0; row--) {
            for (int spaces = 1; spaces <= n-row ; spaces++) {
                System.out.print(" ");
            }
            for (int alpha = 1; alpha <= row; alpha++) {
                System.out.print((char) (alpha+64)+" ");
            }
            System.out.println();
        }

    }
}
