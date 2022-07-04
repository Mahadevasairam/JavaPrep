package com.company;

public class floatingPointAssesment {
    public static void main(String[] args) {
        double petrolPrice = 84.11;
        double dieselPrice = 74.91;
        float QoP = (float) (1546.12 / petrolPrice);
        float QoD = (float) (1546.12 / dieselPrice);
        System.out.println("Quantity of petrol: "+QoP);
        System.out.println("Quantity of Diesel: "+QoD);

    }
}
