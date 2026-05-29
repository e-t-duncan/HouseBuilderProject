package com.sparta.etd.house;

import java.math.BigDecimal;

public class PriceCalculator {

    private final AreaCalculator areaCalculator;
    private final PriceDefinition priceDefinition;

    public PriceCalculator(AreaCalculator areaCalculator, PriceDefinition priceDefinition) {
        this.areaCalculator = areaCalculator;
        this.priceDefinition = priceDefinition;
    }

    public BigDecimal getFloorPrice() {
        var area = BigDecimal.valueOf(areaCalculator.getFloorArea());
        return area.multiply(priceDefinition.getFloorPrice());
    }
}
