package com.Mahadev;

public class MethoddChallenge {


    public static char CalculateGrade(int Marks){
        char Grade;
        if (Marks > 90)
            Grade = 'S';
        else if (Marks > 80 && Marks<=90)
            Grade = 'A';
        else if (Marks > 70 && Marks<=80)
            Grade = 'B';
        else if (Marks > 60 && Marks<=70)
            Grade = 'C';
        else
            Grade = 'D';
        return Grade;

    }

    public static void printData(String studentName,char studentGrade){

        System.out.println("Student Name = "+studentName+" and Student Grade = "+studentGrade);


    }

    public static void main(String[] args) {

        char studentGrade = CalculateGrade(75);
        printData("Mahadev",studentGrade);

    }

}
