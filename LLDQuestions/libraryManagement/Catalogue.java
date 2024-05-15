package LLDQuestions.libraryManagement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Catalogue implements Search{
    private Map<String, List<Book>> bookTitles;
    private Map<String, List<Book>> bookAuthors;
    private Map<String, List<Book>> bookPublications;

    public Catalogue() {
        this.bookTitles = new HashMap<>();
        this.bookAuthors = new HashMap<>();
        this.bookPublications = new HashMap<>();
    }

    @Override
    public List<Book> searchByTitle(String title) {
        return bookTitles.get(title);
    }

    @Override
    public List<Book> searchByAuthor(Author author) {
        return bookAuthors.get(author.getPerson().getName());
    }

    @Override
    public List<Book> searchByPublication(String publication) {
        return bookPublications.get(publication);
    }

    public void addBookInCatalogue(Book book) {
        addBookByTitles(book);
        addBookByAuthor(book);
        addBookByPublication(book);
    }

    public void addBookByTitles(Book book) {
        List<Book> bookByTitles = this.bookTitles.get(book.getTitle());
        bookByTitles.add(book);
        bookTitles.put(book.getTitle(), bookByTitles);
    }

    private void addBookByPublication(Book book) {
        List<Book> bookByPublication = this.bookPublications.get(book.getPublication());
        bookByPublication.add(book);
        bookPublications.put(book.getPublication(), bookByPublication);
    }

    private void addBookByAuthor(Book book) {
        List<Book> bookByAuthor = this.bookAuthors.get(book.getAuthor().getPerson().getName());
        bookByAuthor.add(book);
        bookAuthors.put(book.getAuthor().getPerson().getName(), bookByAuthor);
    }
}
