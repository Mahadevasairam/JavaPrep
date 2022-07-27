package Patterns;

import java.util.Scanner;

public class pattern32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        for (int row = 0; row < n; row++) {
            for (int space = 0; space < n-row; space++) {
                System.out.print("  ");
            }
            System.out.print((row+1)+" ");
            for (int zeros = 0; zeros < 2*row-1 ; zeros++) {
                System.out.print("0 ");
            }
            if(row>0)System.out.print(row+1);
            System.out.println();
        }

    }
}
