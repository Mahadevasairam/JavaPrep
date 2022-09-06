package Basics;

public class Student {
    private String FirstName;
    private String LastName;
    private int Marks;

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getMarks() {
        return Marks;
    }

    public void setMarks(int marks) {
        if(marks<0 || marks>100){
            Marks=0;
        }else Marks = marks;
    }
    public boolean isPass(){
        return Marks>=33 && Marks<=100;

    }
    public void getFullName(){
        System.out.println(FirstName+" "+LastName);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.setFirstName("sudhir");
        s.setLastName("");
        s.getFullName();
        s.setMarks(55);
        System.out.println("Pass: "+s.isPass());
    }
}
