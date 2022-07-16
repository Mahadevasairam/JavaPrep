package Patterns;

import java.util.Scanner;

public class pattern7 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number of Rows: ");
        int n = sc.nextInt();
        for (int row = 0; row < n; row++) {
            if(row == 0 || row == n-1){  //print first and last line
                for (int stars = 0; stars < n; stars++) {
                        System.out.print("* ");
                    }
                }
            else{ //print lines b/w first and last
                System.out.print("* ");
                //print spaces block
                for (int spaces = 0; spaces < n-2; spaces++) {
                    System.out.print("  ");
                    }
                System.out.print("*");
                }
            System.out.println();
            }


    }

}
