package DecoratorDesignPattern;

import DecoratorDesignPattern.Base.BasePizza;
import DecoratorDesignPattern.Base.MargiritaPizza;
import DecoratorDesignPattern.Decorator.ExtraCheese;
import DecoratorDesignPattern.Decorator.Mushroom;

public class DecoratorMain {

    public static void main(String[] args) {

        BasePizza pizza = new Mushroom(new ExtraCheese(new MargiritaPizza()));


        System.out.println("\n" + "Final Price of the Pizza: " + pizza.cost());

    }
}
