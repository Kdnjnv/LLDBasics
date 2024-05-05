package designPatterns.observerPattern.observer;

import designPatterns.observerPattern.observable.StockObservable;

public class PhoneNotificationObserver implements NotificationAlertObserver{
    private String phone;
    private StockObservable stockObservable;

    public PhoneNotificationObserver(StockObservable stockObservable, String phone) {
        this.stockObservable = stockObservable;
        this.phone = phone;
    }

    @Override
    public void update() {
        sendMessage();
    }

    private void sendMessage() {
        System.out.println("New stock is " + stockObservable.getStock() + " and message sent to " + phone);
    }
}
