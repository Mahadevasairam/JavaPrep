package Patterns;

import java.util.Scanner;

public class pattern34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        for (int row = n; row > 0; row--) {
            for (int alpha = row; alpha > 0; alpha--) {
                System.out.print((char)(64+alpha) + " ");
            }
            System.out.println();
        }
    }
}
