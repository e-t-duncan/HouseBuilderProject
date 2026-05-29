package com.sparta.etd.house;

public class HouseModel {

    private static final double MIN_WIDTH = 2.4;
    private static final double MAX_WIDTH = 2.4;

    private static final double MIN_LENGTH = 2.4;
    private static final double MAX_LENGTH = 26.4;

    private static final double MIN_HEIGHT = 2.2;
    private static final double MAX_HEIGHT = 4.7;

    private final HouseDimension width = new HouseDimension(MIN_WIDTH, MAX_WIDTH);
    private final HouseDimension length = new HouseDimension(MIN_LENGTH, MAX_LENGTH);
    private final HouseDimension height = new HouseDimension(MIN_HEIGHT, MAX_HEIGHT);


    public double getCurrentWidth() {
        return width.getCurrent();
    }

    public void setCurrentWidth(double current) {
        width.setCurrent(current);
    }

    public double getCurrentLength() {
        return length.getCurrent();
    }

    public void setCurrentLength(double current) {
        length.setCurrent(current);
    }

    public double getCurrentHeight() {
        return height.getCurrent();
    }

    public void setCurrentHeight(double current) {
        height.setCurrent(current);
    }
}