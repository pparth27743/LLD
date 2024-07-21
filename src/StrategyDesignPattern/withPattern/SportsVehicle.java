package StrategyDesignPattern.withPattern;

import StrategyDesignPattern.withPattern.Strategy.DriveStrategy;

public class SportsVehicle extends Vehicle {

    SportsVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
