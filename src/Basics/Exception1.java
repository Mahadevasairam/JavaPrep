package Basics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
        int x = 4;
        int y = 0;
        //System.out.println(divide(x,y));
        System.out.println(getInt());
    }

    public static double divide(int x, int y) {
        try{
            return x/y;
        }catch (ArithmeticException e) {
            return 0;
        }
    }

    public static int getInt(){
        Scanner sc = new Scanner(System.in);
        try{
            return sc.nextInt();
        }catch(InputMismatchException i){
            return 0;
        }
    }

}
