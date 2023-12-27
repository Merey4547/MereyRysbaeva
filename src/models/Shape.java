package models;

import java.util.ArrayList;

public class Shape {
    ArrayList<Point> points = new ArrayList<>();

    // Constructor to initialize a shape with an array of points
    public Shape(){
        this.points = new ArrayList<>();
    }

    public void addPoint(Point point) {
        points.add(point);
    }

    // Calculate and return the perimeter of the shape
    public double calculatePerimeter(){
        double perimeter = 0;
        int size = points.size();
        for (int i = 0; i < size - 1; i++) {
            perimeter += points.get(i).distanceTo(points.get(i + 1));
        }
        perimeter += points.get(size - 1).distanceTo(points.get(0));
        return perimeter;
    }
    // Find and return the length of the longest side in the shape
    public double getLongestSide() {
        double longestSide = 0, currentSide;
        for (int i = 0; i < points.size(); i++) {
            Point currentPoint = points.get(i);
            Point nextPoint = points.get((i + 1) % points.size());

            currentSide = currentPoint.distanceTo(nextPoint);
            if (currentSide > longestSide) {
                longestSide = currentSide;
            }
        }
        return longestSide;
    }

    // Calculate and return the average length of the sides in the shape.
    public double getAverageSide() {
        int size = points.size();
        if (size == 0) {
            return 0;
        }
        return calculatePerimeter() / size;
    }
}