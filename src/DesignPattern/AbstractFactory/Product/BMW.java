package DesignPattern.AbstractFactory.Product;

public class BMW implements Vehicle{

    @Override
    public void getDescription() {
        System.out.println("This is BMW car");
    }

}
