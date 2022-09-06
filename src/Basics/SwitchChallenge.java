package Basics;

import java.util.Scanner;

public class SwitchChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);

        switch (Character.toLowerCase(c)) {
            case 'a', 'e', 'i', 'o', 'u' -> System.out.println(c + " is a Vowel");
            default -> System.out.println(c + " is a constant");
        }
    }
}
