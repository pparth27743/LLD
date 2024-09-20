package DesignPattern.StrategyDesignPattern.withPattern;

import DesignPattern.StrategyDesignPattern.withPattern.Strategy.DriveStrategy;

public class SportsVehicle extends Vehicle {

    SportsVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
