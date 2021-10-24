package factory.pizza.ingredients;

import factory.pizza.ingredients.cheese.Cheese;
import factory.pizza.ingredients.dough.Dough;
import factory.pizza.ingredients.sauce.Sauce;
import factory.pizza.ingredients.veggies.Veggies;

public interface PizzaIngredientFactory {
    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();
}
