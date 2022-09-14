package DataStructures.Recursion;

import java.util.Arrays;

public class BubbSort {
    static void sort(int[] arr,int si,int li){
        if(li == 0){
            return;
        }
        if(si == li){
            sort(arr,0,--li);
            return;
        }
        if(arr[si]>arr[si+1]){
            int temp = arr[si+1];
            arr[si+1] = arr[si];
            arr[si] = temp;
        }
        sort(arr,++si,li);
    }
    public static void main(String[] args) {
        int[] arr = {50,40,30,20,10};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
