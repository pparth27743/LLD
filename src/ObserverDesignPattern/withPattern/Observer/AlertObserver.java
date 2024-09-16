package ObserverDesignPattern.withPattern.Observer;

import ObserverDesignPattern.withPattern.Observable.StockObservable;

public interface AlertObserver {

    public void update(StockObservable observable);

}
