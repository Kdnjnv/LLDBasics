package LLDQuestions.libraryManagement;

import java.util.Date;

public class LibraryCard {
    private String id;
    private Date issueDate;
    private Date validTill;
    private User user;
    private boolean isActive;

    public LibraryCard(String id, User user, Date issueDate, Date validTill) {
        this.id = id;
        this.user = user;
        this.issueDate = issueDate;
        this.validTill = validTill;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getValidTill() {
        return validTill;
    }

    public void setValidTill(Date validTill) {
        this.validTill = validTill;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
