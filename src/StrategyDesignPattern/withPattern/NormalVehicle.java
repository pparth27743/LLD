package StrategyDesignPattern.withPattern;

import StrategyDesignPattern.withPattern.Strategy.DriveStrategy;

public class NormalVehicle extends Vehicle {

    NormalVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
