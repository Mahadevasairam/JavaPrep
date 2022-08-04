package com.Mahadev;

import java.util.ArrayList;

class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        ArrayList<Integer> ar = new ArrayList<Integer>();
         int temp1=0; int temp2=0;
        int sum = 0; int i =0; int j =0;
        for(i =0;i<arr.length;i++){
            System.out.println("i="+i);
            if(sum==s){
                break;
            }else sum = 0;
            for(j=i;j<arr.length;j++){
                System.out.println("j= "+j);
                if(sum<s){
                    sum = sum + arr[j];
                    System.out.println("sum="+sum);
                    if(sum==s) {
                        temp1 = i;
                        temp2 = j;
                        ar.add(temp1);
                        ar.add(temp2);
                        break;
                    }
                }

            }

        }
        return ar;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(subarraySum(arr,10,27));
    }
}