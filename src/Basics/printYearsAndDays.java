package Basics;

public class printYearsAndDays {
    public static void main(String[] args) {
        YearsAndDays(525600);
        YearsAndDays(1051200);
        YearsAndDays(561600);
    }

    public static void YearsAndDays(long minutes){
        if(minutes<0){
            System.out.println("Invalid value");
        }
        long years = minutes / (365*24*60);
        long remaining = minutes - (years*(365*24*60));
        long days = remaining / (24*60);
        System.out.println(minutes+"min = "+years+"y"+days+"d");

    }


}
