import Behaviors.impl.FlyRocketPowered;
import Duck.Duck;
import Duck.MallarDuck;
import Duck.ModelDuck;
public class Main {

    public static void main(String[] args) {
//        Duck mallard = new MallarDuck();
//        mallard.performQuack();
//        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
