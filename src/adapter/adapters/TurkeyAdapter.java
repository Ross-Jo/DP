package adapter.adapters;

import adapter.ducks.Duck;
import adapter.turkeys.Turkey;

public class TurkeyAdapter implements Duck { // 여기서 duck은 target interface
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) { // turkey는 adaptee
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}
