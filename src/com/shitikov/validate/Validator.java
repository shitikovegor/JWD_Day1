package com.shitikov.validate;

public class Validator {

    public boolean validateInput(String input, String pattern) {
        if (input == null) {
            return false;
        }

        return input.matches(pattern);
    }

    public boolean validateInputTime(String inputTime, String pattern) {
        if (validateInput(inputTime, pattern)) {
            int timeInSeconds;

            try {
                timeInSeconds = Integer.parseInt(inputTime);
            } catch (NumberFormatException e) {
                return false;
            }

            return timeInSeconds >= 0 && timeInSeconds < 86400;
        } else {
            return false;
        }
    }
}
