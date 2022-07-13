package Patterns;

import java.util.Scanner;

public class pattern23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows: ");
        int n = sc.nextInt();
        for (int row = 1; row <= n; row++) {
            for (int number = 0; number <row ; number++) {
                if(number==0||number == row-1) System.out.print(row+" ");
                else System.out.print("0 ");
            }
            System.out.println();
        }
    }
}
