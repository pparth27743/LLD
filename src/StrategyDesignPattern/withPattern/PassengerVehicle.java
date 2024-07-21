package StrategyDesignPattern.withPattern;

import StrategyDesignPattern.withPattern.Strategy.DriveStrategy;

public class PassengerVehicle extends Vehicle {

    PassengerVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
