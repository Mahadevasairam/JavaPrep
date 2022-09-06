package Basics;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = S.nextInt();
        printFactors(n);
    }
    public static void printFactors(int n){
        if(n>0){
            for (int i =1;i<=n; i++){
                if(n%i == 0){
                    System.out.print(i+" ");
                }
            }
        }
        else System.out.println("Invalid Value-");
    }
}
