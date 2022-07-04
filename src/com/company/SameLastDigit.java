package com.company;

import java.util.Scanner;

public class SameLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean result = hasSameDigit(a,b,c);
        System.out.println(result);
    }

    public static boolean hasSameDigit(int a, int b, int c) {
        boolean result = false;
        if ((a >= 10 && a <= 1000) && (b >= 10 && b <= 1000) && (c >= 10 && c <= 1000)) {
            int lasta = a % 10;
            int lastb = b%10;
            int lastc= c%10;
            if(lasta==lastb || lasta == lastc || lastb == lastc){
                result = true;
            }
        }
       return result;
    }
}