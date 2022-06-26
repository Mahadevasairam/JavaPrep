package Patterns;

import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Rows:");
        int n = sc.nextInt();
        int i = 1;

        while(i<=n){

            for(int j =0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
            i++;

        }
    }
}
