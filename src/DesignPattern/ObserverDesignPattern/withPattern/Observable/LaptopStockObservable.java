package DesignPattern.ObserverDesignPattern.withPattern.Observable;

import DesignPattern.ObserverDesignPattern.withPattern.Observer.AlertObserver;

import java.util.ArrayList;
import java.util.List;

public class LaptopStockObservable implements StockObservable{
    private List<AlertObserver> listOfObserver = new ArrayList<>();
    private int currentStock = 0;

    @Override
    public void add(AlertObserver observer) {
        listOfObserver.add(observer);
    }

    @Override
    public void remove(AlertObserver observer) {
        listOfObserver.remove(observer);
    }

    @Override
    public int getStock() {
        return currentStock;
    }

    @Override
    public void notifySubscriber() {
        for(AlertObserver observer : listOfObserver) {
            observer.update(this);
        }
    }

    @Override
    public void setStock(int newStockCount) {
        if(currentStock == 0) {
            currentStock = newStockCount;
            notifySubscriber();
        }
        currentStock = newStockCount;
    }
}
