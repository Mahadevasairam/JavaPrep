package Patterns;

import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Rows:");
        int n = sc.nextInt();
        int i = 1 ;
        String star = "* ";
        while(i<=n){
            for(int j = 1;j<=i;j++){
                System.out.print(star );
            }
            System.out.println();
            i++;
        }
    }
}
