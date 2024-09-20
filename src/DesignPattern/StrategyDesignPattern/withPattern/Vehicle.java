package DesignPattern.StrategyDesignPattern.withPattern;

import DesignPattern.StrategyDesignPattern.withPattern.Strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategy;

    Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        driveStrategy.drive();
    }
}