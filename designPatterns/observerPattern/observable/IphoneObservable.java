package designPatterns.observerPattern.observable;

import designPatterns.observerPattern.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements StockObservable{
    private List<NotificationAlertObserver> notificationAlertObservers = new ArrayList<>();
    private int stockCount;

    public IphoneObservable() {
        stockCount = 0;
    }

    @Override
    public void add(NotificationAlertObserver observer) {
        notificationAlertObservers.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        notificationAlertObservers.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver  observer: notificationAlertObservers) {
            observer.update();
        }
    }

    @Override
    public void setStock(int data) {
        if(stockCount == 0) {
            stockCount = data;
            notifySubscribers();
        }
        stockCount = data;
    }

    @Override
    public int getStock() {
        return stockCount;
    }
}
