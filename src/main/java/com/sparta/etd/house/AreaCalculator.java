package com.sparta.etd.house;

public class AreaCalculator {

    private final HouseModel houseModel;

    public AreaCalculator(HouseModel houseModel) {
        this.houseModel = houseModel;
    }

    public double getFloorArea() {
        return houseModel.getCurrentWidth() * houseModel.getCurrentLength();
    }

    public double getWallArea() {
        double northWalls = houseModel.getCurrentLength() * houseModel.getCurrentHeight() * 2;
        double southWalls = houseModel.getCurrentWidth() * houseModel.getCurrentHeight() * 2;

        return southWalls + northWalls;
    }

    public double getCarportArea() {
        return houseModel.getCurrentCarportWidth() * houseModel.getCurrentCarportLength();
    }

    public double getTotalArea() {
        return getFloorArea() + getCarportArea();
    }

}
