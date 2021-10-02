/*
    Author: Casey Bement
 */

public class Rectangle {

    //Attributes
    private double width;
    private double length;

    //Default Constructor
    public Rectangle(){
        setWidth(0.0);
        setLength(0.0);
    }

    //Overload Constructor
    public Rectangle(double length, double width){
        //this.width = width;
        setWidth(width);
        //this.length = length;
        setLength(length);
    }

    //Methods
    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return length * width;
    }

    //Multiple Args Method
    public void set(double length, double width) {
        this.length = length;
        this.width = width;
    }
}