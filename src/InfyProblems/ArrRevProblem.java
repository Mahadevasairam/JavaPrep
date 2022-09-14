package InfyProblems;

import java.util.ArrayList;
import java.util.List;

public class ArrRevProblem {
    static List<Integer> rev(List<Integer> arr,int m){
        int j = 1; int i = m+1; int count = 0;
        int n = arr.size();
        while(i<n && count<(n-m)/2) {
            int temp = arr.get(i);
            arr.set(i, arr.get(n - j));
            arr.set(n - j, temp);
            j++;
            i++;
            count++;
        }
        return arr;
    }
    public static void main(String[] args) {
        List<Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.add(4);
        ar.add(5);
        ar.add(6);
        ar.add(6);
        ar.add(7);
        ar.add(7);

        System.out.println(rev(ar,1));
//        for(int i:ar){
//            System.out.print(i+" ");
//        }
    }
}
