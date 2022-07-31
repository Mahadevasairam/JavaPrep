package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StringInfy {
    static String find(int n, String s, int m, List<Integer> a){
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < a.size(); i++) {
             int A = a.get(i); int k = 0;
             String s1 = sb.substring(A-1,n-A+1);
             StringBuilder ns = new StringBuilder(s1).reverse();
            for (int j = 0; j < sb.length(); j++) {
                if(j>=A-1 && j<n-A+1)
                {
                    sb.setCharAt(j,ns.charAt(k)) ;
                    k++;
                }
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        String s = sc.nextLine();
        int m = Integer.parseInt(sc.nextLine().trim());
        ArrayList<Integer> a = new ArrayList<>(m);
        for (int i = 0; i < m; i++) {
            a.add(Integer.parseInt(sc.nextLine().trim()));
        }
        String result = find(n,s,m,a);
        System.out.println(result);
    }
}
