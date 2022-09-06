package Basics;

public class fAndDprecision {
    public static void main(String[] args) {

        //printing normal value
        int intvalue = 22;
        float floatvalue = 22;
        double doublevalue = 22;
        System.out.println("Int value:"+intvalue+" Float value:"+floatvalue+" Double value:"+doublevalue);

        // dividing by any number
        int intvalue1 = 22/7;
        float floatvalue1 = 22/7;
        double doublevalue1 = 22/7;
        System.out.println("Int value:"+intvalue1+" Float value:"+floatvalue1+" Double value:"+doublevalue1);

        // with f and d while assigning
        int intvalue2 = 22/7;
        float floatvalue2 = 22f/7f;
        double doublevalue2 = 22d/7d;  // or 22.0/7.0 gives the same value
        System.out.println("Int value:"+intvalue2+" Float value:"+floatvalue2+" Double value:"+doublevalue2);

    }
}
