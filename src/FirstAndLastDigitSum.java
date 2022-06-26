import java.util.Scanner;

public class FirstAndLastDigitSum {
    public static int sumFirstAndLast(int n){
        int s = 0; int firstDigit=0;
        int  LastDigit = n%10;
        System.out.println(LastDigit);
        if(n < 0)
            return -1;
        else{
            while(n>0){
                if(n/10 == 0) {
                    firstDigit = n % 10;
                    System.out.println(firstDigit);
                }
                n = n/10;
            }

        }
        s=firstDigit+LastDigit;
    return s;
    }

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = S.nextInt();
        int result = sumFirstAndLast(n);
        System.out.println(result);
    }
}