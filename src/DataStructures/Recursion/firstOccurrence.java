package DataStructures.Recursion;

public class firstOccurrence {
    static int occurrence(int[] arr,int i, int value){
        if(arr.length == i) return -1;
        if(arr[i]==value) return i;
        return occurrence(arr,++i,value);
    }
    public static void main(String[] args) {
        int[] arr = {6,8,1,1,8,3,4};
        System.out.println(occurrence(arr,0,8));
    }
}
