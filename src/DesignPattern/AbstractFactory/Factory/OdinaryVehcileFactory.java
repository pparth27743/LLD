package DesignPattern.AbstractFactory.Factory;

import DesignPattern.AbstractFactory.Product.Swift;
import DesignPattern.AbstractFactory.Product.Vehicle;

public class OdinaryVehcileFactory implements VehicleFactory{

    @Override
    public Vehicle getVehicle(String vehicleName) {
        if("Swift".equals(vehicleName))
            return new Swift();
        else
            return null;
    }
}
