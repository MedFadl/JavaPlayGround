package com.medhat;

public class Point {
    int x;
    int y;

    public Point(int x , int y){
        this.x = x;
        this.y = y;
    }


    @Override
    public String toString() {
        return x + " , " + y;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Point object))
            return false;
        return x == object.x && y == object.y;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
