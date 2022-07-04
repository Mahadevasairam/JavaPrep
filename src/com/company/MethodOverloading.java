package com.company;

public class MethodOverloading {
    public static void main(String[] args) {
        int length = 10;
        int breadth = 15;
        double height = 4.5;
        area(length);
        area(length,breadth);
        area(breadth,height);


    }

    public static void area(int length){
        double sqarea = length * length;
        System.out.println("area of square: "+sqarea );
    }

    public static void area(int length,int breadth){
        double rectarea = length * breadth;
        System.out.println("area of Rectangle: "+rectarea );
    }

    public static void area(int breadth,double height){
        double triarea = 0.5 * breadth * height;
        System.out.println("area of Triangle: "+triarea );
    }

}
