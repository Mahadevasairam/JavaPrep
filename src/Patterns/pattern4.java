package Patterns;

import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number of Rows:");
        int n = sc.nextInt();
        int row = 1;
        int i = n;
        int j =1;

        while(row<=n){
            for(int space = 0;space<=(i-1)*2;space++){
                System.out.print(" ");
            }
            i--;
            for(int star = 0;star<j;star++){
                System.out.print("* ");
            }
            System.out.println();
            j++;
            row++;
        }

    }
}
