package adapter;

import adapter.adapters.TurkeyAdapter;
import adapter.ducks.Duck;
import adapter.ducks.MallardDuck;
import adapter.turkeys.WildTurkey;

public class Main {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        WildTurkey wildTurkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);

        testDuck(mallardDuck);
        testDuck(turkeyAdapter); // duck 메소드 인터페이스를 사용하지만 실제로는 turkey 객체가 동작함
    }

    static void testDuck(Duck duck) {
        duck.fly();
        duck.quack();
    }
}
