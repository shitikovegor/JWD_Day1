package com.shitikov.console;

import com.shitikov.entity.Point;

public class GeometryConsole {

    public void printSquareArea(double area) {
        System.out.printf("Area of square is - %.2f.%n", area);
    }

    public void printRatio(double bigSquareArea, double smallSquareArea, double ratioOfAreas) {
        System.out.printf("The ratio of the square with area %.2f to square with area %.2f is - %.2f.%n",
                bigSquareArea, smallSquareArea, ratioOfAreas);
    }

    public void printNearestPoint(Point point) {
        if (point != null) {
            System.out.printf("Nearest point is with coordinates: X = %.2f, Y = %.2f.%n", point.getX(), point.getY());
        } else {
            System.out.println("Point distances are equals.");
        }
    }

    public void printCircumferenceAndArea(double circumference, double area) {
        System.out.printf("Circumference =  %.2f, area = %.2f.", circumference, area);
    }
}