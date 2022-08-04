package com.Mahadev;

import java.util.Scanner;

public class pythagoreanTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        TripletCheck(a,b,c);

    }
    public static void TripletCheck (int a, int b, int c){
        int r = (a*a) + (b*b);
        if (r == (c*c)){
            System.out.println("yes given numbers are pythagorean triplet");
        }
    }
}
