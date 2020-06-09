package com.shitikov.service;

import com.shitikov.exception.IncorrectFormatException;
import com.shitikov.validate.FunctionValidator;

import java.util.HashMap;
import java.util.Map;

public class FunctionService {

    public double calcFunction(double numberX) throws IncorrectFormatException {
        FunctionValidator validator = new FunctionValidator();

        if (!validator.validateX(numberX)) {
            throw new IncorrectFormatException("Incorrect format of X");
        }
        double result;

        if (numberX >= 3.0) {
            result = - Math.pow(numberX, 2.0) + 3*numberX + 9;
        } else {
            result = 1 / (Math.pow(numberX, 3.0) - 6);
        }

        return result;
    }

    public Map<Double, Double> calcFunctionOnSegment (double start, double finish, double step) throws IncorrectFormatException {
        FunctionValidator validator = new FunctionValidator();

        if (!validator.validateSegment(start, finish, step)) {
            throw new IncorrectFormatException("Incorrect format of data");
        }

        Map<Double, Double> results = new HashMap<>();

        for (double i = start; i <= finish; i += step) {
            double result = Math.tan(i);

            results.put(i, result);
        }

        return results;
    }
}
