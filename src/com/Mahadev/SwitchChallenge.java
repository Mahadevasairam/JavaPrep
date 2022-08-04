package com.Mahadev;

import java.util.Scanner;

public class SwitchChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);

        switch(Character.toLowerCase(c)){
            case 'a': case 'e': case 'i': case'o': case'u':
                System.out.println(c+" is a Vowel");
                break;
            default:
                System.out.println(c+" is a constant");

        }
    }
}
