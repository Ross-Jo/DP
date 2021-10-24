package factory.pizza;

import factory.pizza.ingredients.cheese.Cheese;
import factory.pizza.ingredients.dough.Dough;
import factory.pizza.ingredients.sauce.Sauce;
import factory.pizza.ingredients.veggies.Veggies;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Veggies[] veggies;

//    public void prepare() {
//        System.out.println("preparing");
//    }

    public abstract void prepare(); // prepare 함수를 추상 함수로 바꾸면서 피자 종류별로 국가별 ingredientFactory를 주입받아, 피자 종류를 기준으로 국가별로 다른 피자를 생산하게 함

    public void bake() {
        System.out.println("bake");
    }

    public void cut() {
        System.out.println("cut");
    }

    public void box() {
        System.out.println("box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
