/*
    Author: Casey Bement
 */

import java.util.Scanner;

public class RoomDimension {

    //Fields
    private double length;
    private double width;

    RoomDimension() {
        //Default constructor
        length = 100;
        width = 100;
    }



    public RoomDimension(double lengthNumber, double widthNumber) {
        //Overloaded constructor
        length = lengthNumber;
        width = widthNumber;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }


    public double getArea() {
        return length * width;
    }

    public String toString() {
        return "\nLength: " + length + "\n" + "Width: " + width + "\n" + "Area: " + this.getArea();
    }



}

