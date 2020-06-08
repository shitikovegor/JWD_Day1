package com.shitikov.service;

import com.shitikov.parse.StringParser;
import java.util.HashMap;

public class FunctionService {

    public double calcFunction(String numberInput) {
        StringParser parser = new StringParser();

        double number = parser.convertStringToDouble(numberInput, true);
        double result;

        if (number >= 3.0) {
            result = - Math.pow(number, 2.0) + 3*number + 9;
        } else {
            result = 1 / (Math.pow(number, 3.0) - 6);
        }

        return result;
    }

    public HashMap<Double, Double> calcFunctionOnSegment (String startInput, String finishInput, String stepInput) {
        StringParser parser = new StringParser();

        double start = parser.convertStringToDouble(startInput, true);
        double finish = parser.convertStringToDouble(finishInput, true);
        double step = parser.convertStringToDouble(stepInput, true);

        HashMap<Double, Double> results = new HashMap<>();

        for (double i = start; i <= finish; i += step) {
            double result = Math.tan(i);

            results.put(i, result);
        }

        return results;
    }
}
