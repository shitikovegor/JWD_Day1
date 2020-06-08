package com.shitikov.entity;

public class Point implements Comparable<Point> {
    private double x;
    private double y;

    public Point() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;

    }

    public double getDistanceToOrigin() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;

        Point other = (Point) obj;

        if (x != other.x)
            return false;
        if (y != other.y)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        long longBits = Double.doubleToLongBits(x);
        result = prime * result + (int)(longBits - (longBits >>> 32));

        longBits = Double.doubleToLongBits(y);
        result = prime * result + (int)(longBits - (longBits >>> 32));

        return result;

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Point{");
        sb.append("x=").append(x);
        sb.append(", y=").append(y);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Point other) {
        if (this.getDistanceToOrigin() < other.getDistanceToOrigin()) {
            return 1;
        } else if (this.getDistanceToOrigin() > other.getDistanceToOrigin()) {
            return -1;
        } else {
            return 0;
        }
    }
}
