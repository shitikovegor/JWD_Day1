package com.shitikov.validate;

public class FunctionValidator {

    public boolean validateX(double numberX) {
        return (Math.pow(numberX, 3) != 6);
    }

    public boolean validateSegment(double start, double finish, double step) {
        if (start > finish) {
            return false;
        }
        if (start + step > finish) {
            return false;
        }
        return true;
    }
}
