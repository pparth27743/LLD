package DesignPattern.StrategyDesignPattern.withPattern;

import DesignPattern.StrategyDesignPattern.withPattern.Strategy.DriveStrategy;

public class PassengerVehicle extends Vehicle {

    PassengerVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
