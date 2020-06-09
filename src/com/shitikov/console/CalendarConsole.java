package com.shitikov.console;

import com.shitikov.entity.PassedTime;

public class CalendarConsole {

    public void printNumberOfDays (int numberOfDaysInMonth) {
        System.out.println("Number of days is - " + numberOfDaysInMonth);
    }

    public void printTime (PassedTime time) {
        System.out.println("Passed " + time.getHours() + "h, " + time.getMinutes() + "min, " + time.getSeconds() + "sec.");
    }
}
