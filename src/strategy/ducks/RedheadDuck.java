package strategy.ducks;

import strategy.flys.FlyWithWings;
import strategy.quacks.Quack;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    void display() {
        System.out.println("I'm a real Red Headed duck");
    }
}
