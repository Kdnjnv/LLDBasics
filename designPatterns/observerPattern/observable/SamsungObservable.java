package designPatterns.observerPattern.observable;

import designPatterns.observerPattern.observer.NotificationAlertObserver;

public class SamsungObservable implements StockObservable{
    @Override
    public void add(NotificationAlertObserver notificationAlertObserver) {

    }

    @Override
    public void remove(NotificationAlertObserver notificationAlertObserver) {

    }

    @Override
    public void notifySubscribers() {

    }

    @Override
    public void setStock(int data) {

    }

    @Override
    public int getStock() {
        return 0;
    }
}
