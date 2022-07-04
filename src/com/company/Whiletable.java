package com.company;

import java.util.Scanner;

public class Whiletable {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        int i = 1;
        while (i < 11){
            System.out.println(n+" x "+ i+" = "+(n*i));
            i++;*/

        //PALINDROME
        int n = 121;
        int m = n;
        int rem;
        int sum =0;
        while(n>0){
            rem = n % 10;
            sum = sum* 10 + rem ;
            n = n/10;
        }
        if (sum == m){
        System.out.println(sum);}
    }
}
