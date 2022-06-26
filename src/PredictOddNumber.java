public class PredictOddNumber {
    public static boolean isOdd(int a){
        return a % 2 != 0;
    }

    public static void main(String[] args) {
        int a = 5;
        while(a < 31){
            if(isOdd(a)) System.out.println("teh odd number is:"+a);
            a++;
        }
    }
}
