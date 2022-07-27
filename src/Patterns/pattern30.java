package Patterns;

import java.util.Scanner;

public class pattern30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        for (int row = 1; row <= n; row++) {
            for (int num = 0; num < row; num++) {
                System.out.print(row+" ");
                if(num<row-1) System.out.print("* ");
            }
            System.out.println();
        }
        for (int row = n-1; row >0; row--) {
            for (int num = 0; num < row; num++) {
                System.out.print(row+" ");
                if(num<row-1) System.out.print("* ");
            }
            System.out.println();
        }

    }
}
