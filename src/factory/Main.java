package factory;

import factory.pizza.Pizza;
import factory.pizzastore.NYPizzaStore;
import factory.pizzastore.PizzaStore;

public class Main {
    public static void main(String[] args) {
        // factory method & abstract factory test
        PizzaStore pizzaStore = new NYPizzaStore(); // '어떤 구체 클래스를 생성할지'를 상속을 통해 자식클래스에게 맡긴다.
        Pizza pizza = pizzaStore.orderPizza("cheese");
        System.out.println(pizza.getName());

        pizza = pizzaStore.orderPizza("veggie");
        System.out.println(pizza.getName());
    }
}
