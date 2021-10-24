package decorator.beverage.condiments;

import decorator.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage { // decorator는 decorating할 대상과 같은 부모를 가져야 함 (mirrors)
    public abstract String getDescription();
}
