package AbstractFactory.Factory;

import AbstractFactory.Product.Swift;
import AbstractFactory.Product.Vehicle;

public class OdinaryVehcileFactory implements VehicleFactory{

    @Override
    public Vehicle getVehicle(String vehicleName) {
        if("Swift".equals(vehicleName))
            return new Swift();
        else
            return null;
    }
}
