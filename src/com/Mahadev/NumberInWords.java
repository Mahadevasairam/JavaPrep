package com.Mahadev;

public class NumberInWords {
    public static void main(String[] args) {
        printNumberInWord(4);
    }
    public static void printNumberInWord(int number){
        switch(number){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            default:
                System.out.println("other");
        }

    }
}
