package Patterns;

import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows: ");
        int n = sc.nextInt();
        int row = 0;
        int j = n;
        int  i = 1;
        while(row<n){
            for(int space1 = 0;space1<=(2*j-2);space1++) {
                System.out.print(" ");
            }
            for(int star = 0;star<(2*i-1);star++){
                System.out.print("* ");
            }
            System.out.println();
            row++;
            i++;
            j--;
        }
    }
}
