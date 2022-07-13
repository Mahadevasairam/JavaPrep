package Patterns;

import java.util.Scanner;

public class pattern25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows: ");
        int n = sc.nextInt();
        for (int row = n; row >=0 ; row--) {
            for (int spaces = 0; spaces < n-row; spaces++) {
                System.out.print("  ");
            }
            for (int side1 = row; side1 >=0 ; side1--) {
                System.out.print(side1+" ");
            }
            for (int side2 = 1; side2 <= row ; side2++) {
                System.out.print(side2+" ");
            }
            System.out.println();
        }
        for (int row = 1; row <=n ; row++) {
            for (int spaces = 0; spaces < n-row ; spaces++) {
                System.out.print("  ");
            }
            for (int side1 = row; side1 >=0; side1--) {
                System.out.print(side1+" ");
            }
            for (int side2 = 1; side2 <= row ; side2++) {
                System.out.print(side2+" ");
            }
            System.out.println();

        }

    }
}
