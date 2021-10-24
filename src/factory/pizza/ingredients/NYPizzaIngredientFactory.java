package factory.pizza.ingredients;

import factory.pizza.ingredients.cheese.Cheese;
import factory.pizza.ingredients.cheese.ReggianoCheese;
import factory.pizza.ingredients.dough.Dough;
import factory.pizza.ingredients.dough.ThinCrustDough;
import factory.pizza.ingredients.sauce.MarinaraSauce;
import factory.pizza.ingredients.sauce.Sauce;
import factory.pizza.ingredients.veggies.Garlic;
import factory.pizza.ingredients.veggies.Onion;
import factory.pizza.ingredients.veggies.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new Garlic(), new Onion()};
        return veggies;
    }
}
