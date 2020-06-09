package com.shitikov.service;

import com.shitikov.entity.Point;
import com.shitikov.exception.IncorrectFormatException;
import com.shitikov.validate.NumberValidator;

public class GeometryService {
    private static final double MIN_VALUE = 0.500;
    private static final double MAX_VALUE = 99999.999;


    public double calcRatioOfAreas(double squareAreaOne, double squareAreaTwo) {
        return squareAreaOne / squareAreaTwo;
    }

    private double calcSquareAreaByDiagonal(double diagonal) {
        return Math.pow(diagonal, 2) / 2;
    }

    public double calcSquareArea(double bigSquareArea) throws IncorrectFormatException {
        NumberValidator validator = new NumberValidator();

        if (!validator.validateNumber(bigSquareArea, MIN_VALUE, MAX_VALUE)) {
            throw new IncorrectFormatException("Incorrect format of area");
        }
        double sideOfBigSquare = Math.sqrt(bigSquareArea);

        return calcSquareAreaByDiagonal(sideOfBigSquare);

    }

    public Point findNearestPoint(Point pointA, Point pointB) {
        int result = pointA.compareTo(pointB);

        if (result == 1) {
            return pointA;
        } else {
            return pointB;
        }
    }

    public double calcCircleArea(double radius) throws IncorrectFormatException {
        NumberValidator validator = new NumberValidator();

        if (!validator.validateNumber(radius, MIN_VALUE, MAX_VALUE)) {
            throw new IncorrectFormatException("Incorrect format of radius");
        }
        double circleArea = Math.PI * Math.pow(radius, 2.0);

        return circleArea;
    }

    public double calcCircumference(double radius) throws IncorrectFormatException {
        NumberValidator validator = new NumberValidator();

        if (!validator.validateNumber(radius, MIN_VALUE, MAX_VALUE)) {
            throw new IncorrectFormatException("Incorrect format of radius");
        }
        double circumference = 2 * Math.PI * radius;

        return circumference;
    }
}
