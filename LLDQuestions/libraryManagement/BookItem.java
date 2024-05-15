package LLDQuestions.libraryManagement;

import LLDQuestions.libraryManagement.enums.BookingStatus;

import java.util.Date;

public class BookItem {
    private Date dateBorrowed;
    private Date dueDate;
    private double price;
    private Date dateOfPurchase;
    private BookingStatus status;
    private Book book;
    private Rack rack;

    public BookItem(double price, Date dateOfPurchase, Rack rack, Book book) {
        this.price = price;
        this.dateOfPurchase = dateOfPurchase;
        this.rack = rack;
        this.book = book;
        this.status = BookingStatus.Free;
    }

    public void checkoutBook() {
        //TODO: implement checkoutBook
        System.out.println("checking out book from book item");
    }

    public Date getDateBorrowed() {
        return dateBorrowed;
    }

    public void setDateBorrowed(Date dateBorrowed) {
        this.dateBorrowed = dateBorrowed;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(Date dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    public BookingStatus getStatus() {
        return status;
    }

    public void setStatus(BookingStatus status) {
        this.status = status;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Rack getRack() {
        return rack;
    }

    public void setRack(Rack rack) {
        this.rack = rack;
    }
}
