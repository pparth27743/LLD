package ObserverDesignPattern.withPattern.Observer;

import ObserverDesignPattern.withPattern.Observable.IphoneStockObservable;
import ObserverDesignPattern.withPattern.Observable.LaptopStockObservable;
import ObserverDesignPattern.withPattern.Observable.StockObservable;

public class EmailAlertObserver implements AlertObserver {
    private final String email;

    public EmailAlertObserver(String email) {
        this.email = email;
    }

    @Override
    public void update(StockObservable observable) {
        if(observable instanceof IphoneStockObservable) {
           sendUpdateForIphone((IphoneStockObservable) observable);
        }
        else if(observable instanceof LaptopStockObservable) {
           sendUpdateForLaptop((LaptopStockObservable) observable);
        }
    }

    private void sendUpdateForIphone(IphoneStockObservable observable) {
        System.out.println("Email: " + email + " Iphone stock is updated current stock units are " + observable.getStock());
    }

    private void sendUpdateForLaptop(LaptopStockObservable observable) {
        System.out.println("Email: " + email + " Laptop stock is updated, current stock units are " + observable.getStock());
    }
}
