package DesignPattern.FactoryDesignPattern.Factory;

import DesignPattern.FactoryDesignPattern.Product.Circle;
import DesignPattern.FactoryDesignPattern.Product.Shape;
import DesignPattern.FactoryDesignPattern.Product.Square;

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
