package com.company;

public class PdromeSumofDigitsRevnum {
    public static void main(String[] args) {
        //Palindrome
        int n = 135;
        int m = n;
        int rem;
        int sum =0;
        while(n>0){
            rem = n % 10;
            sum = sum* 10 + rem ;
            n = n/10;
        }
        if (sum == m){
            System.out.println("Given "+sum+" is palindrome");}
        else{
            System.out.println(sum+" is not palindrome");
        }

        // Sum of digits
        int a = 12345;
        int r;
        int s =0;
        while(a>0){
            r = a % 10;
            s = s + r ;
            a = a/10;
        }
        System.out.println("sum of Digits:"+s);

        int b = 12345;
        int re;
        int su=0;
        while(b>0){
            re = b % 10;
            su = su*10 + re;
            b = b/10;

        }
        System.out.println(su);
    }
    }

