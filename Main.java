import designPatterns.observerPattern.observable.IphoneObservable;
import designPatterns.observerPattern.observable.StockObservable;
import designPatterns.observerPattern.observer.EmailNotificationAlertObserver;
import designPatterns.observerPattern.observer.NotificationAlertObserver;
import designPatterns.observerPattern.observer.PhoneNotificationObserver;
import designPatterns.strategyPattern.withStrategy.PassengerVehicle;
import designPatterns.strategyPattern.withStrategy.SportsVehicle;
import designPatterns.strategyPattern.withStrategy.Vehicle;
import designPatterns.strategyPattern.withStrategy.driveStrategy.DriveStrategy;
import designPatterns.strategyPattern.withStrategy.driveStrategy.NormalDriveStrategy;
import designPatterns.strategyPattern.withStrategy.driveStrategy.SpecialDriveStrategy;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        StockObservable iphoneObservable = new IphoneObservable();

        NotificationAlertObserver emailNotificationAlertObserver = new EmailNotificationAlertObserver(iphoneObservable, "kundanjnv11@gmail.com");
        NotificationAlertObserver phoneNotificationAlertObserver = new PhoneNotificationObserver(iphoneObservable, "1234567890");
        NotificationAlertObserver phoneNotificationAlertObserver2 = new PhoneNotificationObserver(iphoneObservable, "1234567888");

        iphoneObservable.add(emailNotificationAlertObserver);
        iphoneObservable.add(phoneNotificationAlertObserver);
        iphoneObservable.add(phoneNotificationAlertObserver2);

        iphoneObservable.setStock(10);
    }
}