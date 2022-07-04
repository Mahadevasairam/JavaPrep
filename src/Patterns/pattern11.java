package Patterns;

import java.util.Scanner;

public class pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows: ");
        int n = sc.nextInt();
        int row = 0;
        int i = 1;
        int j = n;
        while(row<n) {
            for (int space = 0; space < (2 * j - 2) ; space++){
                System.out.print(" ");
            }
            for(int star=0;star<(i);star++){
                if(star == 0){
                System.out.print("* ");}
                else System.out.print("! * ");
            }
            System.out.println();

            row++;
            j--;
            i++;

        }
    }
}
