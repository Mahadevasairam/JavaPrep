package com.Mahadev;

public class NumberInWords {
    public static void main(String[] args) {
        printNumberInWord(4);
    }
    public static void printNumberInWord(int number){
        switch (number) {
            case 1 -> System.out.println("one");
            case 2 -> System.out.println("two");
            case 3 -> System.out.println("three");
            case 4 -> System.out.println("four");
            case 5 -> System.out.println("five");
            default -> System.out.println("other");
        }

    }
}
