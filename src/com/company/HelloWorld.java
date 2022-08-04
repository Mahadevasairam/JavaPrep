package com.company;

import java.util.Scanner;

public class HelloWorld {
     public static void main(String[] args){
         String result = Name();
         System.out.println("Hello " + result);
    }
    public static String Name() {
        System.out.print("Enter your Name: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

}
