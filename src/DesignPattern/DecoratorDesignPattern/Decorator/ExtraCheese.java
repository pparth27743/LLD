package DesignPattern.DecoratorDesignPattern.Decorator;

import DesignPattern.DecoratorDesignPattern.Base.BasePizza;

public class ExtraCheese extends ToppingDecorator {
    BasePizza pizza;

    public ExtraCheese(BasePizza basePizza) {
        this.pizza = basePizza;
    }

    @Override
    public int cost() {
        return pizza.cost() + 25;
    }
}
