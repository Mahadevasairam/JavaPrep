package InfyProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    static int LPSPS(int n, List<String> Arr){
        List<Integer> arr = new ArrayList<>(); int count = 1;
        for (int i = 0; i < n; i++) {
                int k = 0; int m = Arr.get(i).length();
                while(k<=m){
                    String s = Arr.get(i).substring(k,m);
                    StringBuilder sb = new StringBuilder(s).reverse();
                    if(s.equals(sb.toString())) {
                        arr.add(s.length());
                        break;
                    }
                    else m--;
                }

        }
        for (int i = 1; i < n; i++) {
            if(arr.get(i-1).equals(arr.get(i)))  count++;

        }
        System.out.println(arr.toString());

        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine().trim());
        List<String> Arr = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            Arr.add(sc.nextLine());
        }
        int result = LPSPS(N,Arr);
        System.out.println(result);
    }
}
