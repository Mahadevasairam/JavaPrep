package Patterns;

import java.util.Scanner;

public class pattern6 {

        public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            System.out.print("Enter number of Rows:");
            int n = sc.nextInt();
            for (int row = 0; row < n; row++) {
                //print spaces block
                for (int spaces = 0; spaces < row; spaces++) {
                    System.out.print("    "); //4 spaces
                }
                //print star block
                for (int stars = 0; stars < n-row; stars++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
    }
}
