package Patterns;

import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number of Rows:");
        int n = sc.nextInt();
        int i = n;
        while(i>=1){
            for(int j =0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
            i--;
        }
    }
}
