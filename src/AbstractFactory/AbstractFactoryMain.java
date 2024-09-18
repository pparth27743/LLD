package AbstractFactory;

import AbstractFactory.Factory.AbstractVehicleFactory;
import AbstractFactory.Factory.VehicleFactory;
import AbstractFactory.Product.Vehicle;

public class AbstractFactoryMain {

    public static void main(String[] args) {

        Vehicle vehicle = AbstractVehicleFactory.getVehicle("Luxuary", "BMW");
        vehicle.getDescription();

        VehicleFactory vehicleFactory = AbstractVehicleFactory.getVehicleFactory("Luxuary");
        vehicleFactory.getVehicle("BMW").getDescription();


    }
}
