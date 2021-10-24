package decorator;

import decorator.beverage.Beverage;
import decorator.beverage.Espresso;
import decorator.beverage.condiments.Mocha;

public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
    }
}
