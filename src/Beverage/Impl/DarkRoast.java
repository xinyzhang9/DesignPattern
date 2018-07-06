package Beverage.Impl;

import Beverage.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        setDescription("Dark Roast");
    }
    @Override
    public double cost() {
        return .99;
    }
}
