package Patterns;

import java.util.Scanner;

public class pattern19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows: ");
        int n = sc.nextInt();
        for (int row = 0; row < n; row++) {
            for (int alpha = 0; alpha <= row; alpha++) {
                System.out.print((char)(alpha+65));
            }
            System.out.println();

        }
    }
}
