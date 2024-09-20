package DesignPattern.ObserverDesignPattern.withPattern.Observable;

import DesignPattern.ObserverDesignPattern.withPattern.Observer.AlertObserver;

public interface StockObservable {

    public void add(AlertObserver observer);

    public void remove(AlertObserver observer);

    public void notifySubscriber();

    public void setStock(int newStockCount);

    public int getStock();

}
