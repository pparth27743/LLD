package FactoryDesignPattern.Factory;

import FactoryDesignPattern.Product.Circle;
import FactoryDesignPattern.Product.Shape;
import FactoryDesignPattern.Product.Square;

public class ShapeFactory {

    public static Shape getShape(String shapeName) {
        if("Circle".equals(shapeName))
            return new Circle();
        else if("Square".equals(shapeName))
            return new Square();
        else
            return null;
    }
}
