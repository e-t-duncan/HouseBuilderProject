package com.sparta.etd.house;

import java.math.BigDecimal;

public class HouseApp {

    static void main() {
        HouseModel model = new HouseModel();
        model.setCurrentHeight(5);
        model.setCurrentLength(5);
        model.setCurrentWidth(5.0);
        BigDecimal val = BigDecimal.valueOf(10);

        AreaCalculator calculator = new AreaCalculator(model);
        PriceDefinition priceDefinition = new PriceDefinition(val,val,val);
        PriceCalculator priceCalculator = new PriceCalculator(calculator, priceDefinition);
        System.out.println(priceCalculator.getTotalPrice());

    }
}
