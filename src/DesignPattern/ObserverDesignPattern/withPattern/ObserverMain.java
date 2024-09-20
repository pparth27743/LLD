package DesignPattern.ObserverDesignPattern.withPattern;

import DesignPattern.ObserverDesignPattern.withPattern.Observable.IphoneStockObservable;
import DesignPattern.ObserverDesignPattern.withPattern.Observable.LaptopStockObservable;
import DesignPattern.ObserverDesignPattern.withPattern.Observable.StockObservable;
import DesignPattern.ObserverDesignPattern.withPattern.Observer.AlertObserver;
import DesignPattern.ObserverDesignPattern.withPattern.Observer.EmailAlertObserver;
import DesignPattern.ObserverDesignPattern.withPattern.Observer.MobileAlertObserver;

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
