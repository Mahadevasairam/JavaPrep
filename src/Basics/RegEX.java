package Basics;

import java.util.regex.Pattern;

public class RegEX {
    public static void main(String[] args) {
        System.out.println(
                Pattern.matches("[Mm]ahadev","Mahadev")
        );//M or m and followed by ahadev

        System.out.println(
                Pattern.matches("[pqr][pqr]","pq")
        );//(p or q or r) and (p or q or r)

        System.out.println(
                Pattern.matches("[^pqr]","0")
        );//not pqr

        System.out.println(
                Pattern.matches("[a-zA-Z]","ab")
        );//Single letter from a-z or A-Z

        System.out.println(
                Pattern.matches("[A-Z]*","ABCDEFGNAJA")
        );

        System.out.println(
                Pattern.matches("[a-z&&[^a-d]]","a")
        );//pattern from a-z and not a-d

        System.out.println(
                Pattern.matches("\\d","0445")
        );//is a single digit

        System.out.println(
                Pattern.matches("\\D","a")
        );//not a digit

        System.out.println(
                Pattern.matches("\\S"," ")
        );//not a space

        System.out.println(
                Pattern.matches("\\s"," ")
        );//is a space

        System.out.println(
                Pattern.matches("\\w","A")
        );//is a word character [a-zA-Z_0-9]
    }
}
