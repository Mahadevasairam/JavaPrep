package com.company;

import java.util.Scanner;

public class BarkingDog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean barking = sc.nextBoolean();
        int hourOfDay = sc.nextInt();
        boolean response = shouldWakeUP(barking,hourOfDay);
        System.out.println(response);
    }
    public static boolean shouldWakeUP(boolean barking, int hourOfDay) {
        if (hourOfDay >= 1 && hourOfDay <= 23) {
            if ((barking) && (hourOfDay < 8 || hourOfDay > 22)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}

