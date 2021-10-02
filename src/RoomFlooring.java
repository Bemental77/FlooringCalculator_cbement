
/*
Author: Casey Bement
 */

import java.util.Scanner;

public class RoomFlooring {

    private RoomDimension roomDimension;
    private double costPerFoot;

    public RoomFlooring(RoomDimension roomDimension1, double costPerFoot1) {
        roomDimension = roomDimension1;
        costPerFoot = costPerFoot1;

    }


    public double getTotalCost() {
        return this.costPerFoot * this.roomDimension.getArea();
    }

    public String toString() {
        return "Room Dimension: " + roomDimension + "\n" + "Flooring cost: " + "$" + getTotalCost();
    }


}






















