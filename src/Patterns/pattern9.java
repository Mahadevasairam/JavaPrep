package Patterns;

import java.util.Scanner;

public class pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows: ");
        int n = sc.nextInt();
        for (int row = n; row > 0; row--) {
            //print space block
            for (int spaces = 0; spaces < n-row; spaces++) {
                System.out.print("  ");//2 spaces
            }
            //print star block
            for (int stars = 0; stars < 2*row-1 ; stars++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
