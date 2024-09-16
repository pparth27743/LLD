package ObserverDesignPattern.withPattern;

import ObserverDesignPattern.withPattern.Observable.IphoneStockObservable;
import ObserverDesignPattern.withPattern.Observable.LaptopStockObservable;
import ObserverDesignPattern.withPattern.Observable.StockObservable;
import ObserverDesignPattern.withPattern.Observer.AlertObserver;
import ObserverDesignPattern.withPattern.Observer.EmailAlertObserver;
import ObserverDesignPattern.withPattern.Observer.MobileAlertObserver;

public class ObserverMain {

    public static void main(String[] args) {

        StockObservable iphoneStockObservable = new IphoneStockObservable();
        StockObservable laptopStockObservable = new LaptopStockObservable();

        AlertObserver mobileAlertObserver= new MobileAlertObserver("8905494665");
        AlertObserver emailAlertObserver = new EmailAlertObserver("parthpatel@gmail.com");


        System.out.println("\n");

        iphoneStockObservable.add(mobileAlertObserver);
        iphoneStockObservable.add(emailAlertObserver);
        laptopStockObservable.add(mobileAlertObserver);
        laptopStockObservable.add(emailAlertObserver);



        iphoneStockObservable.setStock(100);
        laptopStockObservable.setStock(50);

    }
}
