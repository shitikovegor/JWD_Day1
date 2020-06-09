package com.shitikov.service;

import com.shitikov.exception.IncorrectFormatException;
import com.shitikov.validate.NumberValidator;

public class ArithmeticService {

    public int calcSquareOfLastDigit(long number) {
        int lastDigit = (int) (number % 10);
        int square = (int) Math.pow(lastDigit, 2);
        int lastDigitOfSquare = square % 10;

        return lastDigitOfSquare;
    }

    public boolean checkForTwoAndMoreEvenNumbers(int[] numbers) {
        boolean twoAndMoreEven = false;
        int counter = 0;

        for (int i = 0; i < numbers.length && counter < 2; i++) {
            if (numbers[i] % 2 == 0) {
                counter++;
            }
        }

        if (counter > 1) {
            twoAndMoreEven = true;
        }

        return twoAndMoreEven;
    }

    public boolean isPerfectNumber(long number) throws IncorrectFormatException {
        NumberValidator validator = new NumberValidator();
        final long minValue = 0;
        final long maxValue = 9999999999999999L;

        if (!validator.validateNumber(number, minValue, maxValue)) {
            throw new IncorrectFormatException("Incorrect number format");
        }

        long sumOfOddNumbersCubes = 1;
        long oddNumber = 3;

        if (number % 2 != 0) {
            return false;
        }

        while (sumOfOddNumbersCubes < number) {
            sumOfOddNumbersCubes += Math.pow(oddNumber, 3);
            oddNumber += 2;
        }

        return sumOfOddNumbersCubes == number;
    }
}
