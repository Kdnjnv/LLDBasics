package LLDQuestions.libraryManagement;

public abstract class User {
    private Person person;
    private String username;
    private String password;
    public abstract void resetPassword();

    public User(Person person, String username, String password) {
        this.person = person;
        this.username = username;
        this.password = password;
    }
}
