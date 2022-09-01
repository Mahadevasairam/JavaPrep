package InfyProblems;

import java.util.Scanner;

public class network {
    static int networkFormation(int[] arr, int minComps, int speed) {
        int min = 0; int i = 0;
        int sum = 0; int count = 0;
        while (sum < speed && i< arr.length) {
            if (minComps <= min) min = 0;
            else {
                sum = sum + arr[i];
                i++;
                min++;
            }
            if(sum>speed) {
                count++;
                sum=0;
                min = 0;
            }
        }
        return count;
    }
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int minComps = sc.nextInt();
            int speedThreshold = sc.nextInt();
            int result = networkFormation(arr,minComps,speedThreshold);
            System.out.println(result);
        }
    }
