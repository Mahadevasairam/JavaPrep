package com.company;

import java.util.Scanner;

public class HelloWorld {
     public static void main(String[] args){
         String result = name();
         System.out.println("Hello " + result);
    }
    public static String name() {
        System.out.print("Enter your Name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        return name;
    }

}
