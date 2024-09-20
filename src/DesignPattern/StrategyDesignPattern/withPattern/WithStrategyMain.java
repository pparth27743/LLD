package DesignPattern.StrategyDesignPattern.withPattern;

import DesignPattern.StrategyDesignPattern.withPattern.Strategy.SimpleStrategy;
import DesignPattern.StrategyDesignPattern.withPattern.Strategy.SpecialStrategy;

public class WithStrategyMain {

    public static void main(String[] args) {
        new NormalVehicle(new SpecialStrategy()).drive();
        new PassengerVehicle(new SimpleStrategy()).drive();
        new SportsVehicle(new SpecialStrategy()).drive();

    }
}
