
/*
Author: Casey Bement
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class FlooringCalculatorProgram {
    public static void main(String[] args) {
        double length;
        double width;
        double flooringPrice;

        //create a scanner object for Keyboard input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("To get the price of flooring for your room, you must input the room's dimensions");

        //Create a decimalFormat object for output formatting
        DecimalFormat fmt = new DecimalFormat("0.00");

        //Get a length
        System.out.print("Enter the length of the room: ");
        length = keyboard.nextDouble();

        //Get a width
        System.out.print("Enter the width of the room: ");
        width = keyboard.nextDouble();

        //Get a price per square foot
        System.out.print("Enter the price per square foot: ");
        flooringPrice = keyboard.nextDouble();

        RoomDimension roomSize = new RoomDimension(length, width);

        RoomFlooring room = new RoomFlooring(roomSize, flooringPrice);

        //Display area
        System.out.println(room);


    }
}
