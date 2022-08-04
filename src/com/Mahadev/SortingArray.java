package com.Mahadev;

import java.util.Scanner;

public class SortingArray {
    public static int[] takeArray(int number){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[number];
        for(int i =0; i<number;i++){
            arr[i] = sc.nextInt();
        }
    return arr;
    }
    public static int[] sortArray(int[] array){
        int temp = 0;
        for(int i =0;i<array.length;i++){
            for( int j =i+1;j< array.length;j++){
                if(array[i]>array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter an number: ");
        int number = sc.nextInt();
        System.out.println("enter "+number+" integers");
        int[] array = takeArray(number);
        int[] result = sortArray(array);
        for(int i =0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
