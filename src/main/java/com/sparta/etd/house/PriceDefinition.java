package com.sparta.etd.house;
import java.math.BigDecimal;

public class PriceDefinition {

    private final BigDecimal floorPrice;
    private final BigDecimal wallPrice;

    public PriceDefinition(BigDecimal floorPrice, BigDecimal wallPrice) {
        this.floorPrice = floorPrice;
        this.wallPrice = wallPrice;
    }

    public BigDecimal getFloorPrice() {
        return floorPrice;
    }

    public BigDecimal getWallPrice() {
        return wallPrice;
    }
}