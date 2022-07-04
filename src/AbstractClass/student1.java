package AbstractClass;

public class student1 extends Marks{
    public int marks1;
    public int marks2;
    public int marks3;

    public student1(int marks1, int marks2, int marks3) {
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    @Override
    public void getPercentage() {
        double percent = (double)(marks1+marks2+marks3)/300*100;
        System.out.println("com.company.Student 1 percentage is:"+ percent);
    }
}
