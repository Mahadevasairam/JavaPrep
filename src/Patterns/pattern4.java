package Patterns;

import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number of Rows: ");
        int n = sc.nextInt();
        for (int row = 1; row <= n; row++) {
            //print space block
            for (int spaces = 0; spaces < n-row; spaces++) {
                System.out.print("  ");
                }
            //print star block
            for (int star = 0; star < row; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
