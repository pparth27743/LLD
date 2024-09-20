package DesignPattern.AbstractFactory;

import DesignPattern.AbstractFactory.Factory.AbstractVehicleFactory;
import DesignPattern.AbstractFactory.Factory.VehicleFactory;
import DesignPattern.AbstractFactory.Product.Vehicle;

public class AbstractFactoryMain {

    public static void main(String[] args) {

        Vehicle vehicle = AbstractVehicleFactory.getVehicle("Luxuary", "BMW");
        vehicle.getDescription();

        VehicleFactory vehicleFactory = AbstractVehicleFactory.getVehicleFactory("Luxuary");
        vehicleFactory.getVehicle("BMW").getDescription();


    }
}
