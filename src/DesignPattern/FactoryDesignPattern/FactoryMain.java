package DesignPattern.FactoryDesignPattern;

import DesignPattern.FactoryDesignPattern.Factory.ShapeFactory;
import DesignPattern.FactoryDesignPattern.Product.Shape;

public class FactoryMain {

    public static void main(String[] args) {

        Shape shape = ShapeFactory.getShape("Square");
        shape.draw();

    }
}
