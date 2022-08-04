package com.Mahadev;

import java.util.Scanner;

public class WeightConversion {
    public static void main(String[] args) {

        System.out.println("Enter the Weight: ");
        Scanner sc = new Scanner(System.in);
        double weightkgs = sc.nextDouble();
        convert(weightkgs);

    }

    public static void convert(double kgs){
        double grams = kgs * 1000;
        double milligrams = kgs * 1000000;
        System.out.println("Weight in grams :"+grams);
        System.out.println("Weight in milligrams: "+milligrams);

    }

}
