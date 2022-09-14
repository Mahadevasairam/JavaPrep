package DataStructures.Recursion;

public class isSorted {
    static boolean sorted(int[] arr,int i){
        if(arr.length-1 == i) return true;
        if(arr[i]>arr[i+1]){
            return false;
        }
        return sorted(arr,++i);
    }
    public static void main(String[] args) {
        //int[] arr ={3,8,16,21,99,724};
        int[] arr = {1};
        System.out.println(sorted(arr,0));
    }
}
