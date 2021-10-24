package factory.pizzastore;

import factory.pizza.*;
import factory.pizza.ingredients.NYPizzaIngredientFactory;
import factory.pizza.ingredients.PizzaIngredientFactory;

public class NYPizzaStore extends PizzaStore {
    Pizza pizza = null;
    PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

    @Override
    Pizza createPizza(String type) { // 자식 클래스가 구체화한 factory method
        if (type.equals("cheese")) {
            // abstract factory
            // 피자의 종류별로 국가별 ingredient factory를 주입받아 최종적인 객체를 생성해냄
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("NY style cheese pizza");
        } else if(type.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("NY style veggie pizza");
        }
        return pizza;
    }
}
