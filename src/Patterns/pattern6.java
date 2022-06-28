package Patterns;

import java.util.Scanner;

public class pattern6 {

        public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            System.out.print("Enter number of Rows:");
            int n = sc.nextInt();
            int row = 1;
            int i = 1;
            int j = n;
            while(row<=n){
                for(int space = 0;space<4*i;space++){
                    System.out.print(" ");
                }
                i++;
                for(int star =0;star<j;star++){
                    System.out.print("* ");
                }
                j--;
                row++;
                System.out.println();
            }

    }
}
