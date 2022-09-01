package InfyProblems;

import java.util.Scanner;

public class AlanPair {
    public static int pairs(int n,int[] arr){
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] + arr[j] > arr[i] * arr[j] ) count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = pairs(n,arr);
        System.out.println(result);

    }
}
