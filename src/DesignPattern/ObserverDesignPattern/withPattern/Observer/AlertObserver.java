package DesignPattern.ObserverDesignPattern.withPattern.Observer;

import DesignPattern.ObserverDesignPattern.withPattern.Observable.StockObservable;

public interface AlertObserver {

    public void update(StockObservable observable);

}
