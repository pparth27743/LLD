package AbstractFactory.Factory;

import AbstractFactory.Product.Vehicle;

public interface VehicleFactory {

    Vehicle getVehicle(String vehicleName);
}
