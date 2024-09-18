package AbstractFactory.Factory;

import AbstractFactory.Product.BMW;
import AbstractFactory.Product.Vehicle;

public class LuxuaryCarFactory implements VehicleFactory{

    @Override
    public Vehicle getVehicle(String vehicleName) {
        if("BMW".equals(vehicleName))
            return new BMW();
        else
            return null;
    }
}