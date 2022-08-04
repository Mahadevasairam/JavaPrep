package com.Mahadev;

public class ComplexNumber {
    int a1; int a2; int b1; int b2;

    public ComplexNumber(int a1, int b1, int a2, int b2) {
        this.a1 = a1;
        this.a2 = a2;
        this.b1 = b1;
        this.b2 = b2;
    }
    public void addComplex(){
        System.out.println((a1+a2)+"+"+(b1+b2)+"i");
    }
    public void subComplex(){
        System.out.println((a1-a2)+"+"+(b1-b2)+"i");
    }

    public static void main(String[] args) {
        ComplexNumber cn = new ComplexNumber(4,8,5,7);
        cn.addComplex();
        cn.subComplex();
    }

}
