package com.Mahadev;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("enter 2 numbers : ");
        int a = S.nextInt();
        int b = S.nextInt();
        int result =getGreatestCommonDivisor(a,b);
        System.out.println(result);
    }
    public static int getGreatestCommonDivisor(int a,int b){
        int gcd = 1;
        if(a>10 && b>10){
            for(int i =1; i<a && i<b ;i++){
                if(a%i == 0 && b%i ==0)
                    gcd = i;

            }
        }
        else return -1;
        return gcd;
    }

}
