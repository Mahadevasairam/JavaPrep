package com.Mahadev;

public class StudentInformation {
    private String name;
    private int rollno;
    private String std;
    private char sec;

    public StudentInformation() {
        this("defname",1,"unknown",'A');
    }

    public StudentInformation(String name, int rollno) {
        this(name , rollno , "unknown",'A');
        this.name = name;
        this.rollno = rollno;
    }

    public StudentInformation(String name, int rollno, String std, char sec) {
        this.name = name;
        this.rollno = rollno;
        this.std = std;
        this.sec = sec;
    }

    public String getName() {
        return name;
    }

    public int getRollno() {
        return rollno;
    }

    public String getStd() {
        return std;
    }

    public char getSec() {
        return sec;
    }

    public static void main(String[] args) {
        StudentInformation student1 = new StudentInformation("Mahadev",2,"1st",'B');
        StudentInformation student2 = new StudentInformation("maha",1);
        StudentInformation student3 = new StudentInformation();
        System.out.println(student3.getName()+student3.getStd());
        System.out.println(student1.getName()+student1.getRollno());

    }
}
