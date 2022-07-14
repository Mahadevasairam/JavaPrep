package Patterns;

import java.util.Scanner;

public class pattern26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows(odd number only): ");
        int n = sc.nextInt();
        for (int row = 0; row < (n+1)/2; row++) {
            for (int outSpaces = 0; outSpaces < (n+1)/2-row ; outSpaces++) {
                System.out.print("    ");
            }
            for (int side1 = row+1; side1 > 0; side1--) {
                System.out.print(side1+" ");
            }
            for (int inSpace = 1; inSpace < 2*row ; inSpace++) {
                System.out.print("  ");
            }
            for (int side2 = 1; side2 <= row+1 ; side2++) {
                if(row == 0) continue;
                System.out.print(side2+" ");
            }
            System.out.println();
        }
        for (int row = (n+1)/2-2; row >=0 ; row--) {
            for (int outSpaces = 0; outSpaces < (n+1)/2-row ; outSpaces++) {
                System.out.print("    ");
            }
            for (int side1 = row+1; side1 > 0; side1--) {
                System.out.print(side1+" ");
            }
            for (int inSpace = 1; inSpace < 2*row ; inSpace++) {
                System.out.print("  ");
            }
            for (int side2 = 1; side2 <= row+1 ; side2++) {
                if(row == 0) continue;
                System.out.print(side2+" ");
            }
            System.out.println();
        }
    }
}
