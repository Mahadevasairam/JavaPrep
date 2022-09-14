package Basics;

import java.util.Scanner;

public class PrimeMostEfficient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = false;
        for (int i = 2; i < Math.pow(n,0.5)+1; i++) {
            if(n%i==0){
                System.out.println(n+" is not a prime");
                flag = true;
                break;
            }

        }
        if(!flag) System.out.println("is prime");
    }
}
