package DataStructures.Recursion;

import java.util.Scanner;

public class powerUsingRecursion {
    static double pow(double x,double n){
        if(n==0) return 1;
        else if(n<0) {
            n = -n;
            return 1/(x*pow(x,n-1));
        }
        else return x*pow(x,n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double n = sc.nextDouble();
        if(n>=Integer.MAX_VALUE || n<=Integer.MIN_VALUE ) n = n%100;
        double result = pow(x,n);
        System.out.println(x+" power "+n+" : "+result);
    }
}
