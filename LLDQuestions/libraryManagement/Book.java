package LLDQuestions.libraryManagement;

import java.util.Date;

public class Book {
    private String ISBN;
    private String name;
    private String title;
    private String publication;
    private Date publicationDate;
    private Author author;

    public Book(String ISBN, String name, String title, String publication, Date publicationDate, Author author) {
        this.ISBN = ISBN;
        this.name = name;
        this.title = title;
        this.publication = publication;
        this.publicationDate = publicationDate;
        this.author = author;
    }

    public Book() {
        this.ISBN = "ISBN";
        this.name = "name";
        this.title = "title";
        this.publication = "publication";
        this.publicationDate = new Date();
        this.author = new Author();
    }

    public void printBookDetails() {
        StringBuilder sb = new StringBuilder();
        sb.append("name: " + getName() + "\n");
        sb.append("ISBN: " + getISBN() + "\n");
        sb.append("title: " + getTitle() + "\n");
        sb.append("publication: " + getPublication() + "\n");
        sb.append("Author: " + author.printAuthor() + "\n");
        System.out.println(sb.toString());
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
