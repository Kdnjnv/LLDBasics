package LLDQuestions.libraryManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.SplittableRandom;

public class Author {
    private List<String> listOfBooksPublished;
    private Person person;

    public Author() {
        this.person = new Person();
        this.listOfBooksPublished = new ArrayList<>();
    }

    public Author(Person person) {
        this.listOfBooksPublished = new ArrayList<>();
        this.person = person;
    }

    public String printAuthor() {
        StringBuilder sb = new StringBuilder();
        sb.append("list of books published: " + listOfBooksPublished + "\n");
        sb.append("Person: " + person.printPerson() + "\n");
        //System.out.println(sb.toString());
        return sb.toString();
    }

    public Author(Person person,  List<String> listOfBooksPublished) {
        this.person = person;
        this.listOfBooksPublished = listOfBooksPublished;
    }

    public List<String> getListOfBooksPublished() {
        return listOfBooksPublished;
    }

    public void addNewBookPublished(String newBookPublished) {
        this.listOfBooksPublished.add(newBookPublished);
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
