package com.Mahadev;

import java.util.Scanner;

public class Inputcalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner sc = new Scanner(System.in);
        int count = 0;int sum =0;int avg = 0;
        while(true){
            boolean isInt = sc.hasNextInt();
            if(isInt){
                int n = sc.nextInt();
                sum = sum + n;
                count++;
            }
            else if(count == 0){
                System.out.println("SUM = "+sum+" AVG = "+avg);
                break;
            }
            else{
                avg = sum/count;
                System.out.println("SUM = "+sum+" AVG = "+avg);
                break;
            }

        }
    }

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
}
