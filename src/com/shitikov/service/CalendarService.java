package com.shitikov.service;

import com.shitikov.entity.PassedTime;
import com.shitikov.entity.Month;
import com.shitikov.exception.IncorrectFormatException;
import com.shitikov.validate.CalendarValidator;

public class CalendarService {
    private static final int LEAP_YEAR_DIVIDER = 4;
    private static final int START_OF_LEAP_YEAR = 1582;

    public int numberOfDaysInMonth(int year, int monthNumber) throws IncorrectFormatException {
        CalendarValidator validator = new CalendarValidator();

        if (!validator.validateYear(year) || !validator.validateMonth(monthNumber)) {
            throw new IncorrectFormatException("Incorrect format of date");
        }

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

    public PassedTime getTime(int timeInSeconds) throws IncorrectFormatException {
        CalendarValidator validator = new CalendarValidator();

        if (!validator.validateTime(timeInSeconds)) {
            throw new IncorrectFormatException("Incorrect format of date");
        }
        PassedTime time = new PassedTime(timeInSeconds);

        return time;
    }
}
