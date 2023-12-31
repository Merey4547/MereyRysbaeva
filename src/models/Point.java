package models;

public class Point {
    //Enter two coordinates
    private final double x;
    private final double y;

    //Constructor to initialize a point with given x and y coordinates
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //Calculate and return the distance from the current point to the destination point
    public double distanceTo(Point dest) {
        double dx = this.x - dest.x;
        double dy = this.y - dest.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    //Provide a string representation of the point in the format
    @Override
    public String toString() {
        return( "(" + x + "," + y + ")" );

    }
}
