package LLDQuestions.libraryManagement;

import LLDQuestions.libraryManagement.enums.BookingStatus;

import java.util.Date;

public class BookLending {
    private Date creationDate;
    private Date dueDate;
    private Date returnDate;
    private String id;
    private BookItem  bookItem;
    private Member member;

    public BookLending(Date creationDate, Date dueDate, Date returnDate, String id) {
        this.creationDate = creationDate;
        this.dueDate = dueDate;
        this.returnDate = returnDate;
        this.id = id;
    }

    public void lendBookItem(BookItem bookItem, Member member) {
        bookItem.setDateBorrowed(this.creationDate);
        bookItem.setDueDate(this.dueDate);
        bookItem.setStatus(BookingStatus.Booked);
        this.bookItem = bookItem;
        this.member = member;
    }

    public void fetchLendingDetails(BookItem bookItem) {
        //TODO: do we need this?
    }

    public Date getDueDate() {
        return dueDate;
    }
}
