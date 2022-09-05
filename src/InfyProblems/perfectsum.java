package InfyProblems;

import java.util.Scanner;

public class perfectsum {
    public static int psum(int n,int[] arr,int sum){
        int count = 0; int s = 0; int j = 0;
        for (int i = 0; i < n ; i++) {
            s=arr[i]; j = i+1;
            while(j<n) {
                s = s + arr[j];
                if(s<sum) j++;
                else if(s>sum) s = arr[i];
                else {
                    count++;
                    s = arr[i];
                    j++;
                }
            }
        }
        if(count>0) return count;
        return 999;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        int sum = sc.nextInt();
        int result = psum(n,arr,sum);
        System.out.println(result);
    }
}
