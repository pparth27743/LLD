package StrategyDesignPattern.withoutPattern;

public class WithOutStrategyMain {
    public static void main(String[] args) {
         new NormalVehicle().drive();
         new PassengerVehicle().drive();
         new SportsVehicle().drive();
    }
}