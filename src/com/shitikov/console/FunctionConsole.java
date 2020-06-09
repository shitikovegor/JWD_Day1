package com.shitikov.console;

import java.util.Map;

public class FunctionConsole {

    public void printResultOfFunction(double result) {
        System.out.printf("Result of function = %.2f.%n", result);
    }

    public void printSpreesheetOfResults(Map<Double, Double> results) {
        String format = "| %-6s | %-6s |%n";
        System.out.printf("+--------+--------+%n" + "|   X    |  F(x)  |%n" + "+--------+--------+%n");
        String spreesheet = String.format("+--------+--------+%n") +
            String.format("|   X    |  F(x)  |%n") +
            String.format("+--------+--------+%n");

        for (Map.Entry<Double, Double> entry : results.entrySet()) {
            System.out.printf(format, String.format("%.3f", entry.getKey()), String.format("%.3f", entry.getValue()));
        }

        System.out.printf("+--------+--------+%n");
    }
}
