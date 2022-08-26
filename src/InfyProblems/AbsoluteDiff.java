package InfyProblems;

import java.util.Arrays;
import java.util.Scanner;

public class AbsoluteDiff {
    static void abSol(int[] arr){
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        int m = 0;
        for (int i = arr.length-1; i>0; i--) {
            m = arr[i]-arr[i-1];
            min = Math.min(min,m);
        }
        for (int i = 1;i< arr.length;i++) {
            if(arr[i]-arr[i-1] == min){
                System.out.print(arr[i-1]+" "+arr[i]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        abSol(arr);
    }
}
