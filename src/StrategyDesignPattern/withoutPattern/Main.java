package StrategyDesignPattern.withoutPattern;

public class Main {
    public static void main(String[] args) {
         new NormalVehicle().drive();
         new PassengerVehicle().drive();
         new SportsVehicle().drive();
    }
}