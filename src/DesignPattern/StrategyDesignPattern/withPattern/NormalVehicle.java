package DesignPattern.StrategyDesignPattern.withPattern;

import DesignPattern.StrategyDesignPattern.withPattern.Strategy.DriveStrategy;

public class NormalVehicle extends Vehicle {

    NormalVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
