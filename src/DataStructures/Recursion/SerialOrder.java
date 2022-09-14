package DataStructures.Recursion;

public class SerialOrder {
    static void printArray(int[] arr,int len,int i){
        if(i==len){
            return;
        }
        System.out.println(arr[i]+" ");
        printArray(arr,len,++i);
    }
    public static void main(String[] args) {
        int[] arr = {3,5,7,2,4};
        printArray(arr,arr.length,0);
    }
}
