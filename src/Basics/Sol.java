package Basics;

import java.util.ArrayList;
import java.util.Scanner;

public class Sol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int an = sc.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            for (int j = 0; j < an; j++) {
                a.add(sc.nextInt());
            }
            arr.add(a);
        }
        int ann = sc.nextInt();
        for (int i = 0; i < ann; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(arr.get(x-1).size()<y) System.out.println("ERROR !");
            else System.out.println(arr.get(x-1).get(y-1));
        }
    }
}
