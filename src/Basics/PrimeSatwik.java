package Basics;

public class PrimeSatwik {
    static int total = 0;
    public static void main(String[] args) {
        for (int i = 1; i <100 ; i++) {
            isPrime(i);
        }
        System.out.println();
        System.out.println("Total:"+total);
//  System.out.println("total no :" + ct);
    }
    public static void isPrime(int x){
        int count=0;
//  if(x<2) System.out.println(x + "is not a prime number!");
        for (int j=2;j<x;j++){
            if (x%j==0) count++;
        }
        if (count==0) {
            total++;
            System.out.print(x + " ");
        }
    }
}