package designPatterns.observerPattern.observer;

import designPatterns.observerPattern.observable.StockObservable;

public class EmailNotificationAlertObserver implements NotificationAlertObserver{
    String email;
    StockObservable observable;

    public EmailNotificationAlertObserver(StockObservable observable, String email) {
        this.observable = observable;
        this.email = email;
    }

    @Override
    public void update() {
        sendMail();
    }

    public void sendMail() {
        System.out.println("Current stock is " + observable.getStock() + " and Mail sent to " + email);
    }
}
