package com.shitikov.service;

import com.shitikov.parse.StringParser;

public class ArithmeticService {

    public int calcSquareOfLastDigit(String numberInput) {
        StringParser parser = new StringParser();

        long number = parser.convertStringToLong(numberInput, "\\-?\\d+");

        int lastDigit = (int) (number % 10);
        int square = (int) Math.pow(lastDigit, 2);

        return square % 10;
    }

    public boolean checkForTwoAndMoreEvenNumbers(String numbersInput) {
        StringParser parser = new StringParser();

        boolean twoAndMoreEven = false;
        int counter = 0;

        int[] numbers = parser.convertStringToIntArray(numbersInput);

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

    public boolean isPerfectNumber(String numberInput) {
        StringParser parser = new StringParser();

        long number = parser.convertStringToLong(numberInput, "\\d+");
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
