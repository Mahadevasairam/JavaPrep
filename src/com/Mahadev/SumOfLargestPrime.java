package com.Mahadev;

import java.util.Scanner;

public class SumOfLargestPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            int result = largePrimeFactor(i);
            sum = sum + result;
        }
        System.out.println(sum);
    }
    static int largePrimeFactor(int n){
        for (int i = n; i > 0; i--) {
            if(n%i == 0){
                if(prime(i)) return i;
            }
        }
        return 0;
    }
    static boolean prime(int n){
        int count = 0;
        for (int j = 1; j <= n; j++) {
            if(n%j==0) count++;
        }
        return count == 2;
    }
}
