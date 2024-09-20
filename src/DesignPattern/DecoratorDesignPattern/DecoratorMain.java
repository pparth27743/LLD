package DesignPattern.DecoratorDesignPattern;

import DesignPattern.DecoratorDesignPattern.Base.BasePizza;
import DesignPattern.DecoratorDesignPattern.Base.MargiritaPizza;
import DesignPattern.DecoratorDesignPattern.Decorator.ExtraCheese;
import DesignPattern.DecoratorDesignPattern.Decorator.Mushroom;

import java.util.ArrayList;

public class DecoratorMain {

    public static void main(String[] args) {

        BasePizza pizza = new Mushroom(new ExtraCheese(new MargiritaPizza()));


        System.out.println("\n" + "Final Price of the Pizza: " + pizza.cost());

    }
}
