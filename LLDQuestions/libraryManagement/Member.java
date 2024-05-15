package LLDQuestions.libraryManagement;

import java.util.Date;
import java.util.List;

public class Member extends User{
    private int totalBooksCheckedOut;
    private Date dateOfJoining;

    public Member() {
        super(new Person(), "username", "password");
        this.totalBooksCheckedOut = 0;
        this.dateOfJoining = new Date();
    }

    public Member(Person person, String username, String password) {
        super(person, username, password);
        this.dateOfJoining = new Date();
        this.totalBooksCheckedOut = 0;
    }

    @Override
    public void resetPassword() {
        System.out.println("reset password");
    }

    public void issueBookItem(BookItem bookItem) {
        this.totalBooksCheckedOut++;
        System.out.println("Book item " + bookItem + " issued");
    }

    public void returnBookItem(BookItem bookItem) {
        this.totalBooksCheckedOut--;
        System.out.println("Book item " + bookItem + " returned");
    }

    public void reserveBookItem(BookItem bookItem) {
        System.out.println("book item" + bookItem + " reserved");
    }

    public int getTotalBooksCheckedOut() {
        return totalBooksCheckedOut;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public void checkoutBookItem(List<BookItem> bookItems) {
        this.totalBooksCheckedOut += bookItems.size();
        System.out.println("list of book items checked out" + bookItems);
    }

    public void renewBookItem(BookItem bookItem) {
        System.out.println("renewing " + bookItem);
    }

    public void checkForFine() {
        System.out.println("checking for fine");
    }
}
