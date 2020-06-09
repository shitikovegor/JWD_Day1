package com.shitikov.validate;

public class CalendarValidator {
    private static final int FIRST_YEAR = 0;
    private static final int LAST_YEAR = 4000;
    private static final int FIRST_MONTH = 1;
    private static final int LAST_MONTH = 12;
    private static final int START_OF_DAY = 0;
    private static final int FINISH_OF_DAY = 86400;


    public boolean validateYear(int year) {
        return year >= FIRST_YEAR && year <= LAST_YEAR;
    }

    public boolean validateMonth(int monthNumber) {
        return monthNumber >= FIRST_MONTH && monthNumber <= LAST_MONTH;
    }

    public boolean validateTime(int timeInSeconds) {
        return timeInSeconds >= START_OF_DAY && timeInSeconds < FINISH_OF_DAY;
    }
}
