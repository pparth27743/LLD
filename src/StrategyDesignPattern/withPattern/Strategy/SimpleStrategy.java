package StrategyDesignPattern.withPattern.Strategy;

public class SimpleStrategy implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Simple Drive");
    }
}
