package InfyProblems;

import java.util.Scanner;

public class SameLetters {
    public static String meth(String str){
        StringBuilder sb = new StringBuilder(str);
        int i = 1;
        while(i<sb.length()){
            if(sb.charAt(i-1) == sb.charAt(i)) {
                sb.delete(i-1,i+1); i=0;
            }
            i++;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = meth(str);
        System.out.println(result);
    }
}
