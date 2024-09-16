package ObserverDesignPattern.withPattern.Observer;

import ObserverDesignPattern.withPattern.Observable.IphoneStockObservable;
import ObserverDesignPattern.withPattern.Observable.LaptopStockObservable;
import ObserverDesignPattern.withPattern.Observable.StockObservable;

public class MobileAlertObserver implements AlertObserver {
    private final String phoneNumber;

    public MobileAlertObserver(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(StockObservable observable) {
        if(observable instanceof IphoneStockObservable) {
            System.out.println("PhoneNumber: " + phoneNumber + " Iphone stock is updated current stock units are " + observable.getStock());
        }
        else if(observable instanceof LaptopStockObservable) {
            System.out.println("PhoneNumber: " + phoneNumber + " Laptop stock is updated, current stock units are " + observable.getStock());
        }
    }
}
