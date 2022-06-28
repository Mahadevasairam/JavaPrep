package Patterns;

import java.util.Scanner;

public class pattern7 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number of Rows:");
        int n = sc.nextInt();
        int i = n;
        int j = (n*2)-4;
        int row = 1;
        while(row<=n){
            if( row == 1 || row == n){
                for(int star =0;star <n; star++)
                    System.out.print("* ");
                System.out.println();
            }
            else{
                System.out.print("* ");
                for(int space = 0;space<j;space++)
                    System.out.print(" ");
                System.out.print("*");
                System.out.println();
            }
           row++;

        }
    }
}
