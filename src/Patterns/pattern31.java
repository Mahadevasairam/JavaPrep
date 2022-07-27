package Patterns;

import java.util.Scanner;

public class pattern31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        for (int row = 0; row < n; row++) {
            for (int num = n; num > 0 ; num--) {
                if(num == row+1) System.out.print("* ");
                else System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}
