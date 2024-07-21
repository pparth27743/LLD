package StrategyDesignPattern.withPattern;

import StrategyDesignPattern.withPattern.Strategy.SimpleStrategy;
import StrategyDesignPattern.withPattern.Strategy.SpecialStrategy;

public class Main {

    public static void main(String[] args) {
        new NormalVehicle(new SpecialStrategy()).drive();
        new PassengerVehicle(new SimpleStrategy()).drive();
        new SportsVehicle(new SpecialStrategy()).drive();

    }
}
