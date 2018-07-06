package Beverage.Impl;

import Beverage.Beverage;
import Beverage.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    // beverage to be decorated
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
