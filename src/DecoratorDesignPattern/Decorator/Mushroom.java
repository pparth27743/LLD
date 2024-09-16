package DecoratorDesignPattern.Decorator;

import DecoratorDesignPattern.Base.BasePizza;

public class Mushroom extends ToppingDecorator{
    private BasePizza pizza;

    public Mushroom(BasePizza basePizza) {
        this.pizza = basePizza;
    }

    @Override
    public int cost() {
        return pizza.cost() + 45;
    }
}
