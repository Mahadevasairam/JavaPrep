package com.company;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = S.nextInt();
        boolean result = printPerfectNumber(n);
        System.out.println(result);
    }
    public static boolean printPerfectNumber(int n){
        int sum = 0;
        boolean result = false;
        if(n>0){
            for (int i =1;i<n; i++){
                if(n%i == 0){
                    sum = sum + i;
                }
            }
        }
        if (sum == n) result = true;
     return result;
    }
}
