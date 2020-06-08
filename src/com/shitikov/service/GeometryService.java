package com.shitikov.service;

import com.shitikov.entity.Point;
import com.shitikov.parse.StringParser;

public class GeometryService {


    public double calcRatioOfAreas(double squareAreaOne, double squareAreaTwo) {
        return squareAreaOne / squareAreaTwo;
    }

    private double calcSquareAreaByDiagonal(double diagonal) {
        return Math.pow(diagonal, 2) / 2;
    }

    public double calcSquareArea(String bigSquareAreaInput) {
        StringParser parser = new StringParser();

        double bigSquareArea = parser.convertStringToDouble(bigSquareAreaInput, false);
        double sideOfBigSquare = Math.sqrt(bigSquareArea);

        return calcSquareAreaByDiagonal(sideOfBigSquare);

    }

    public Point pointFromInput(String x, String y) {
        StringParser parser = new StringParser();

        double pointX = parser.convertStringToDouble(x, true);
        double pointY = parser.convertStringToDouble(y, true);

        return new Point(pointX, pointY);
    }

    public Point findNearestPoint(Point pointA, Point pointB) {
        int result = pointA.compareTo(pointB);

        if (result == 1) {
            return pointA;
        } else if (result == -1) {
            return pointB;
        } else {
            return null;
        }
    }

    public double calcCircleArea(String radiusInput) {
        StringParser parser = new StringParser();

        double radius = parser.convertStringToDouble(radiusInput, false);

        return Math.PI * Math.pow(radius, 2.0);
    }

    public double calcCircumference(String radiusInput) {
        StringParser parser = new StringParser();

        double radius = parser.convertStringToDouble(radiusInput, false);

        return 2 * Math.PI * radius;
    }
}
