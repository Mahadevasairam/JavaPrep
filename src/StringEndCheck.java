import java.util.Scanner;

public class StringEndCheck {
    public static boolean check(String s1,String s2){
        int count = 0; boolean result = false;

        int i = s1.length()-1;
        int j = s2.length()-1;
        while(!result){
             if(s1.charAt(i) == s2.charAt(j)){
                 count++;
                 i--;
                 j--;
             }
             else break;
             if(count == s2.length()){
                 result = true;
             }

        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String 1:");
        String s1 = sc.nextLine();
        System.out.print("Enter String 2:");
        String s2 = sc.nextLine();
        System.out.println(check(s1,s2));
    }
}
