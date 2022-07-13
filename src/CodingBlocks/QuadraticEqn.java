package CodingBlocks;

import java.util.Scanner;

public class QuadraticEqn {
    public static void main(String[] args) {
        System.out.print("Enter a,b,c:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = (b * b) - (4 * a * c);

        int root1 = 0;
        int root2 = 0;

        if(d < 0){
            System.out.println("Imaginary");
            return;
        }
        else if(d == 0){
            System.out.println("Real and Equal");
        }
        else {
            System.out.println("Real and Distinct");
        }

        root1 = (int) ((- b - Math.sqrt(d)) / (2 * a));
        root2 = (int) ((- b + Math.sqrt(d)) / (2 * a));

        System.out.println(root1 +" "+root2);

    }
    }

