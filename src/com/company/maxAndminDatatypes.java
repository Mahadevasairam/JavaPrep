package com.company;

public class maxAndminDatatypes  {

    public static void main(String[] args) {
        int a= Integer.MAX_VALUE;
        int b= Integer.MIN_VALUE;
        System.out.println("Integer ranges from "+a+" to "+b);

        byte c = Byte.MAX_VALUE;
        byte d = Byte.MIN_VALUE;
        System.out.println("Byte ranges from "+c+" to "+d);

        long e = Long.MAX_VALUE;
        long f = Long.MIN_VALUE;
        System.out.println("Long ranges from "+e+" to "+f);

        short g = Short.MAX_VALUE;
        short h = Short.MIN_VALUE;
        System.out.println("Short ranges from "+g+" to "+h);

        float i = Float.MAX_VALUE;
        float j = Float.MIN_VALUE;
        System.out.println("Float ranges from "+i+" to "+j);

        double k = Double.MAX_VALUE;
        double l = Double.MIN_VALUE;
        System.out.println("Double ranges from "+k+" to "+l);

        byte newByteValue = c;
        System.out.println(newByteValue);
        byte newByteValue1 = (byte) (c/2);
        System.out.println(newByteValue1);

        short newShortValue = g;
        System.out.println(newShortValue);
        short newShortValue1 = (short) (g/2);
        System.out.println(newShortValue1);

        float x = 10.0f; // or x = 10f
        double y = 10.0d;
        double z = 10d;
    }
}
