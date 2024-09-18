package FactoryDesignPattern;

import FactoryDesignPattern.Factory.ShapeFactory;
import FactoryDesignPattern.Product.Shape;

public class FactoryMain {

    public static void main(String[] args) {

        Shape shape = ShapeFactory.getShape("Square");
        shape.draw();

    }
}
