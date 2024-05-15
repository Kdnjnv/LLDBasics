package LLDQuestions.libraryManagement;

public class EmailNotification extends Notification{
    private String email;

    public EmailNotification(String message, String email) {
        super(message);
        this.email = email;
    }

    @Override
    public boolean sendNotification() {
        System.out.println("Sending notification: " + this.message + " via email: " + this.email);
        return true;
    }
}
