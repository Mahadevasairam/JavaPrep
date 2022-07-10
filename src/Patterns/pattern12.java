package Patterns;

import java.util.Scanner;

public class pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows: ");
        int n = sc.nextInt();
        for (int row = 0; row <= n; row++) {
            for (int star = 0; star < row; star++) {
                System.out.print("*");
            }
            for (int spaces = 0; spaces < 2*(n-row); spaces++) {
                System.out.print(" ");
            }
            for (int star = 0; star < row; star++) {
                System.out.print("*");
            }
            System.out.println();

        }
        for (int row = n; row >= 0; row--) {
            for (int star = 0; star < row; star++) {
                System.out.print("*");
            }
            for (int spaces = 0; spaces < 2*(n-row); spaces++) {
                System.out.print(" ");
            }
            for (int star = 0; star < row; star++) {
                System.out.print("*");
            }
            System.out.println();

        }
            
        }
    }

