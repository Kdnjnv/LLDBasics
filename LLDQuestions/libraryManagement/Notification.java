package LLDQuestions.libraryManagement;

public abstract class Notification {
    public String message;
    public abstract boolean sendNotification();
    public Notification(String message) {
        this.message = message;
    }
}
