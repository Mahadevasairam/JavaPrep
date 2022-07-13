package CodingBlocks;
import java.util.Scanner;

//car is allowed to run on sunday
// if sum of even digits is divisible by 4
// or sum of odd digits is divisible by 3

public class DelhiOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter car Number: ");
        int carNumber = sc.nextInt();
        int rem; int oddSum = 0; int evenSum = 0; int count = 0;
        while(carNumber>0){
            rem = carNumber%10;
            if(count%2!=0){
                oddSum = oddSum + rem;
            }
            else {
                evenSum = evenSum + rem;
            }
            carNumber = carNumber/10;
            count++;
        }
        System.out.println("Odd Digits Sum: "+oddSum);
        System.out.println("Even Digits Sum: "+evenSum);
        if(evenSum%4==0 || oddSum%3==0){
            System.out.println("car is allowed to run on sunday");
        }
        else System.out.println("car is not allowed to run on sunday");

    }
}
