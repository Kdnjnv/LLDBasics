package LLDQuestions.libraryManagement;

import java.util.List;

public interface Search {
    public abstract List<Book> searchByTitle(String title);
    public abstract List<Book> searchByAuthor(Author author);
    public abstract List<Book> searchByPublication(String publication);
}