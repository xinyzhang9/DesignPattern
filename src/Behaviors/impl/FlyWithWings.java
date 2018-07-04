package Behaviors.impl;

import Behaviors.FlyBehavior;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I am flying!!");
    }
}
