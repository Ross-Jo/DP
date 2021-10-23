package strategy;

import strategy.ducks.Duck;
import strategy.ducks.MallardDuck;
import strategy.flys.FlyNoWay;

public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        
        mallard.setFlyBehavior(new FlyNoWay());
        mallard.performFly();
    }
}
