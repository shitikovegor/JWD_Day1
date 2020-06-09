package com.shitikov.parse;

import com.shitikov.exception.IncorrectFormatException;

public class StringParser {

    public int parseStringToInt(String numberInput) throws IncorrectFormatException {
        try {
            return Integer.parseInt(numberInput);
        } catch (NumberFormatException e) {
            throw new IncorrectFormatException("Incorrect input format");
        }
    }

    public int[] parseStringToIntArray(String numbersInput) throws IncorrectFormatException {

        String[] numbers = numbersInput.split("\\s");
        int[] result = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            int number = parseStringToInt(numbers[i]);
            result[i] = number;
        }

        return result;
    }

    public long parseStringToLong(String input) throws IncorrectFormatException {
        try {
            return Long.parseLong(input);
        } catch (NumberFormatException e) {
            throw new IncorrectFormatException("Incorrect input format");
        }
    }

    public double parseStringToDouble(String input) throws IncorrectFormatException {
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
            throw new IncorrectFormatException("Incorrect input format");
        }
    }
}
