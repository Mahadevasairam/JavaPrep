package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class FindPairs {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> a;
        for(int i = 1;i<n;i++){
            a=new ArrayList<>();
            for (int j = 1; j <n ; j++) {
                if(i+j == n){
                    a.add(i);
                    a.add(j);
                }
            }
            arr.add(a);
        }
        System.out.println(arr);
    }
}
