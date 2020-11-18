package exercise8;

import java.util.Scanner;

public class Point {
    double x;
    double y;
    
    // Define attributes

    public Point() {
        x = 0;
        y = 0;
        // Initialize attributes to 0
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
        
        // Initialize attributes by coping x and y parameters
    }

    public Point(Point otherPoint) {
       x = otherPoint.x;
       y = otherPoint.y;
       
        // Initialize attributes by coping attributes of otherPoint
    }

    public void initialize() { // ne e static => za 1 to4ka 

    System.out.print("Enter x: ");
    x = Utils.INPUT.nextDouble();
    System.out.print("Enter y: ");
    y = Utils.INPUT.nextDouble();
     // Change attributes through console

    }

    public void translate(double xDelta, double yDelta) {
        x = x + xDelta;
        y = y + yDelta;

        // Change attributes by adding xDelta and yDelta
    }

    public Point createNewTranslatedPoint(double xDelta, double yDelta) {
        double newX = x + xDelta;
        double newY = y + yDelta;        // Create new point which is translated relative to this point

        return new Point(newX, newY);
    }

    public boolean equals(Point otherPoint) {
        boolean xEqual = x == otherPoint.x;
        boolean yEqual = y == otherPoint.y;
        
        // Compare attributes of this point to attributes of otherPoint for equality
        return xEqual && yEqual;
    }

    public String toString() {
        return "("+ x +", "+ y +")";

        // Represent attributes as string
       
    }
}
