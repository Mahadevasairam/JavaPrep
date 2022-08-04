package com.Mahadev;

public class EqualityPrinter {
    public static void printEqual(int x, int y, int z){
        int equal = x;
        if ( x <0 || y<0 || z<0){
            System.out.println("Invalid value");

        }
        else if (x == equal && y == equal && z == equal){
            System.out.println("All numbers are Equal");
        }

        else{
            System.out.println("Neither all are equal or different");
        }

    }

    public static void main(String[] args) {
        printEqual(1,1,1);
        printEqual(1,1,2);
        printEqual(-1,-1,-1);
        printEqual(1,2,3);
    }
}
