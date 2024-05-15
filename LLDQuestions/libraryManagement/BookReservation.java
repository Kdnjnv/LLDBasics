package LLDQuestions.libraryManagement;

import java.util.List;

public class BookReservation {
    private List<BookItem> reservedBooks;

    public void reserveBook(BookItem bookItem) {
        reservedBooks.add(bookItem);
    }
}
