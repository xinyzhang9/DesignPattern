package Duck;

import Behaviors.impl.FlyWithWings;
import Behaviors.impl.Quack;
import Duck.Duck;

public class MallarDuck extends Duck {
    public MallarDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I am a real Mallard duck");
    }
}
