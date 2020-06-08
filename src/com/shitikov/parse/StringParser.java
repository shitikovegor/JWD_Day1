package com.shitikov.parse;

import com.shitikov.exception.IncorrectFormatException;
import com.shitikov.validate.Validator;

public class StringParser {

    public int parseStringToInt(String numberInput, String pattern) {
        Validator validator = new Validator();

        if (validator.validateInput(numberInput, pattern)) {
            try {
                return Integer.parseInt(numberInput);
            } catch (NumberFormatException e) {
                throw new IncorrectFormatException("Invalid input format");
            }
        } else {
            throw new IncorrectFormatException("Invalid input format");
        }
    }

    public int[] convertStringToIntArray(String numbersInput) {

        String[] numbers = numbersInput.split("\\s");
        int[] result = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            int number = parseStringToInt(numbers[i], "\\d+");
            result[i] = number;
        }

        return result;
    }

    public long convertStringToLong(String input, String pattern) {
        Validator validator = new Validator();

        if (validator.validateInput(input, pattern)) {
            return Long.parseLong(input);
        } else {
            throw new IncorrectFormatException("Invalid input format");
        }
    }

    public double convertStringToDouble(String numberInput, boolean mayBeNegative) {
        Validator validator = new Validator();

        String pattern = mayBeNegative ? "\\-?\\d+\\.?\\d*" : "\\d+\\.?\\d*";

        if (validator.validateInput(numberInput, pattern)) {
            return Double.parseDouble(numberInput);
        } else {
            throw new IncorrectFormatException("Invalid input format");
        }
    }

    public int convertStringToSeconds(String secondsInput, String pattern) {
        Validator validator = new Validator();

        if (validator.validateInputTime(secondsInput, pattern)) {
            return Integer.parseInt(secondsInput);
        } else {
            throw new IncorrectFormatException("Invalid input format");
        }
    }
}
