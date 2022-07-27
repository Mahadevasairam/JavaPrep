package Patterns;

import java.util.Scanner;

public class pattern29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        for (int row = 0; row < n; row++) {
            for (int spaces = 0; spaces < n-row; spaces++) {
                System.out.print("  ");
            }
            if(row>0){
            for (int num = n-row; num < n ; num++) {
                System.out.print(num+" ");
                }
            }
            System.out.print("0 ");
            if(row>0){
                for (int num1 = n-1; num1 >= n-row ; num1--) {
                    System.out.print(num1+" ");
                }
            }
            System.out.println();
        }
    }
}
