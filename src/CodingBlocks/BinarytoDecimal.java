package CodingBlocks;

import java.util.Scanner;

public class BinarytoDecimal {
    public static void main(String[] args) {
        System.out.println("Enter value:");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        int counter = 0; int rem; int decimalValue=0;
        while (value>0){
            rem = value%10;
            decimalValue = decimalValue + (int)(rem * Math.pow(2,counter));
            value=value/10;
            counter++;
        }
        System.out.println("Decimal Value:"+decimalValue);

    }
}
