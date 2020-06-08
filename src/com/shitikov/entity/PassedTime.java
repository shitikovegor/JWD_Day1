package com.shitikov.entity;

public class PassedTime {
    private final int SECONDS_IN_HOUR = 3600;
    private final int MINUTES_IN_HOUR = 60;

    private int hours;
    private int minutes;
    private int seconds;

    public PassedTime() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    public PassedTime(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public PassedTime(int timeInSeconds) {
        this.hours = timeInSeconds / SECONDS_IN_HOUR;
        this.minutes = (timeInSeconds % SECONDS_IN_HOUR) / MINUTES_IN_HOUR;
        this.seconds = (timeInSeconds % SECONDS_IN_HOUR) % MINUTES_IN_HOUR;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;

        PassedTime other = (PassedTime) obj;

        if (hours != other.hours)
            return false;
        if (minutes != other.minutes)
            return false;
        if (seconds != other.seconds)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + hours;
        result = prime * result + minutes;
        result = prime * result + seconds;

        return result;

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PassedTime{");
        sb.append("hours=").append(hours);
        sb.append(", minutes=").append(minutes);
        sb.append(", seconds=").append(seconds);
        sb.append('}');
        return sb.toString();
    }
}
