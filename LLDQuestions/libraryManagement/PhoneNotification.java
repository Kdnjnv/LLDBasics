package LLDQuestions.libraryManagement;

public class PhoneNotification extends Notification{
    private String phoneNumber;

    public PhoneNotification(String message, String number) {
        super(message);
        this.phoneNumber = number;
    }

    @Override
    public boolean sendNotification() {
        System.out.println("Sending notification message: " + this.message + " to phone number: " + this.phoneNumber);
        return true;
    }
}
