package AbstractFactory.Factory;

import AbstractFactory.Product.Vehicle;

public class AbstractVehicleFactory {

    public static Vehicle getVehicle(String type, String vehicleName) {
        if("Luxuary".equals(type)) {
            return (new LuxuaryCarFactory().getVehicle(vehicleName));
        }
        else if("Odinary".equals(type)) {
            return (new OdinaryVehcileFactory().getVehicle(vehicleName));
        }
        else
            return null;
    }

    public static VehicleFactory getVehicleFactory(String type) {
        if("Luxuary".equals(type)) {
            return new LuxuaryCarFactory();
        }
        else if("Odinary".equals(type)) {
            return new OdinaryVehcileFactory();
        }
        else
            return null;
    }


}
