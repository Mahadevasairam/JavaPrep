package Basics;

public class Floor {
    private double Width;
    private double Length;

    public Floor(double width, double length) {
       if(width<0 ) Width = 0;
       else if(length <0) Length = 0;
       else{
           Width = width;
           Length = length;
       }
    }
    public double getArea(){
        return this.Width * this.Length;
    }

}
