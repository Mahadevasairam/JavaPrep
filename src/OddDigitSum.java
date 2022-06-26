import java.util.Scanner;

public class OddDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        int result = getOddDigitSum(n);
        System.out.println("Sum of Odd Digits: "+result);

    }
    public static int getOddDigitSum(int n){
        int s = 0; int rem;
        if(n<0) {
            return -1;
        }
        else{
            while (n > 0) {
                rem = n % 10;
                if (rem % 2 != 0) {
                    s = s + rem;
                }
                n = n / 10;

            }
        }

        return s;
    }

}
