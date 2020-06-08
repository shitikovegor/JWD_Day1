package com.shitikov.entity;

public enum Month {
    JANUARY ("January", 1, 31),
    FEBRUARY ("February", 2, 28),
    MARCH ("March", 3, 31),
    APRIL("April", 4, 30),
    MAY ("May", 5, 31),
    JUNE ("June", 6, 30),
    JULE ("July", 7, 31),
    AUGUST ("August", 8, 31),
    SEPTEMBER ("September", 9, 30),
    OCTOBER ("October", 10, 31),
    NOVEMBER ("November", 11, 30),
    DECEMBER("December",12, 31);

    private String name;
    private int numberOfMonth;
    private int numberOfDays;

    Month(String name, int numberOfMonth, int numberOfDays) {
        this.name = name;
        this.numberOfMonth = numberOfMonth;
        this.numberOfDays = numberOfDays;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfMonth() {
        return numberOfMonth;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public static Month getMonthByNumber (int numberOfMonth) {
        for (Month month : Month.values()) {
            if (month.numberOfMonth == numberOfMonth) {
                return month;
            }
        }
        return null;
    }
}
