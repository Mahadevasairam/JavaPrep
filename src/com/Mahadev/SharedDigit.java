package com.Mahadev;

import java.util.Scanner;

public class SharedDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers :");
        int a = sc.nextInt();
        int b= sc.nextInt();
        boolean result = hasSharedDigit(a,b);
        System.out.println(result);
    }
    public static boolean hasSharedDigit(int a , int b){
        boolean c = false;
        if(a>=10 && a<=99 && b>=10 && b<=99){
            int lastA = a%10;
            //System.out.println(lasta);
            int firstA = a/10;
            //System.out.println(firsta);
            int firstb = b/10;
            //System.out.println(firstb);
            int lastb = b%10;
            //System.out.println(lastb);
            if( (lastA == firstb || lastA==lastb) || (firstA==firstb || firstA==lastb)){
                c=true;
            }
        }
        return c;
    }
}
