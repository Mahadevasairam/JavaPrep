package Patterns;

import java.util.Scanner;

public class pattern22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows: ");
        int n = sc.nextInt();
        if(n>0) System.out.println("1");
        int counter =1;
        while(counter<n){
            counter++;
            System.out.print("1");
            if(counter%2==0){
                for (int i = 0; i < counter-2; i++) System.out.print("0");
            }
            else {
                for (int i = 0; i < counter-2; i++)  System.out.print("1");
            }
            System.out.print("1");
            System.out.println();

        }
    }
}

