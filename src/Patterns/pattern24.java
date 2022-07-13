package Patterns;

import java.util.Scanner;

public class pattern24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows: ");
        int n = sc.nextInt();
        for (int row = 1; row <= n; row++) {
            for (int number = 1; number <= row; number++) {
                System.out.print(number);

            }
            for (int star = n-row; star >0 ; star--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
