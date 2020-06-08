package com.shitikov.service;

import com.shitikov.entity.PassedTime;
import com.shitikov.entity.Month;
import com.shitikov.parse.StringParser;

public class CalendarService {
    private final int LEAP_YEAR_DIVIDER = 4;
    private final int START_OF_LEAP_YEAR = 1582;

    public int numberOfDaysInMonth(String yearInput, String monthNumberInput) {
        StringParser parser = new StringParser();

        int year = parser.parseStringToInt(yearInput, "\\d{1,4}");
        int monthNumber = parser.parseStringToInt(monthNumberInput, "[1-9]|1[0-2]");

        int numberOfDays;

        if (checkLeapYear(year) && monthNumber == 2) {
            numberOfDays = Month.getMonthByNumber(monthNumber).getNumberOfDays() + 1;
        } else {
            numberOfDays = Month.getMonthByNumber(monthNumber).getNumberOfDays();
        }
        return numberOfDays;
    }

    private boolean checkLeapYear(int year) {
        boolean isLeapYear = false;

        if (year > START_OF_LEAP_YEAR && year % LEAP_YEAR_DIVIDER == 0) {
            isLeapYear = true;
        }

        return isLeapYear;
    }

    public PassedTime getTime(String secondsInput) {
        StringParser parser = new StringParser();

        int timeInSeconds = parser.convertStringToSeconds(secondsInput,"\\d{1,5}");
        PassedTime time = new PassedTime(timeInSeconds);

        return time;
    }
}
