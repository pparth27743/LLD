package DesignPattern.AbstractFactory.Factory;

import DesignPattern.AbstractFactory.Product.Vehicle;

public interface VehicleFactory {

    Vehicle getVehicle(String vehicleName);
}
