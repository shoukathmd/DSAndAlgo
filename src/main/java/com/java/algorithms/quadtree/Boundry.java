package com.java.algorithms.quadtree;

public class Boundry {
    public Boundry(int xMin, int yMin, int xMax, int yMax) {
        super();
        this.xMin = xMin;
        this.xMax = xMax;
        this.yMin = yMin;
        this.yMax = yMax;
    }

    public boolean inRange(int x, int y) {
        return (x >= xMin && x <= xMax && y >= yMin && y <= yMax);
    }


    public int getyMin() {
        return yMin;
    }

    public void setyMin(int yMin) {
        this.yMin = yMin;
    }

    public int getxMax() {
        return xMax;
    }

    public void setxMax(int xMax) {
        this.xMax = xMax;
    }

    public int getyMax() {
        return yMax;
    }

    public void setyMax(int yMax) {
        this.yMax = yMax;
    }

    int xMin, yMin, xMax, yMax;

    public int getxMin() {
        return xMin;
    }

    public void setxMin(int xMin) {
        this.xMin = xMin;
    }
}
