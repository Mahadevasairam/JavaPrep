package Patterns;

import java.util.Scanner;

public class pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows: ");
        int n = sc.nextInt();
        for(int row = 0;row<n;row++) {
            for (int space = 0; space < n-row-1 ; space++){
                System.out.print("  ");
            }
            for(int star=0;star<=row;star++){
                if(star == 0)   System.out.print("* ");
                else  System.out.print("! * ");
            }
            System.out.println();
        }
    }
}
