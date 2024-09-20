package DesignPattern.ObserverDesignPattern.withPattern.Observable;

import DesignPattern.ObserverDesignPattern.withPattern.Observer.AlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservable implements StockObservable {

    private List<AlertObserver> listOfObserver = new ArrayList<>();
    private int stockCount = 0;

    @Override
    public void add(AlertObserver observer) {
        listOfObserver.add(observer);
    }

    @Override
    public void remove(AlertObserver observer) {
        listOfObserver.remove(observer);
    }

    @Override
    public void notifySubscriber() {
        for(AlertObserver observer : listOfObserver) {
            observer.update(this);
        }
    }

    @Override
    public void setStock(int newStockCount) {
        if(stockCount == 0) {
            stockCount = newStockCount;
            notifySubscriber();
        }
        stockCount = newStockCount;
    }

    @Override
    public int getStock() {
        return stockCount;
    }
}
