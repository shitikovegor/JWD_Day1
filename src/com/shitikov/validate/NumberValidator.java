package com.shitikov.validate;

public class NumberValidator {

    public boolean validateNumber(long number, long minValue, long maxValue) {
        return (number >= minValue && number <= maxValue);
    }

    public boolean validateNumber(double number, double minValue, double maxValue) {
        return (number >= minValue && number <= maxValue);
    }
}
