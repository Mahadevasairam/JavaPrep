package AbstractClass;

public class student2 extends Marks {
    private int marks1;
    private int marks2;
    private int marks3;
    private int marks4;

    public student2(int marks1, int marks2, int marks3, int marks4) {
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
        this.marks4 = marks4;
    }

    @Override
    public void getPercentage() {
        double percent =(double)(marks1+marks2+marks3+marks4)/400*100;
        System.out.println("com.company.Student 2 percentage is:"+ percent);

    }
}
