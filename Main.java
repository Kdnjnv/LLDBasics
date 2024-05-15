import LLDQuestions.libraryManagement.*;

import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("ISBN2", "name2", "title2", "publication2", new Date(), new Author(new Person("name2", new Address(), "kundanjnv11@gmail.com")));
        book1.printBookDetails();
        book2.printBookDetails();

        BookItem bookItem = new BookItem(100, new Date(), new Rack(100, "rack01"), book1);
        BookItem bookItem2 = new BookItem(101, new Date(), new Rack(101, "rack02"), book2);

        Member member1 = new Member(new Person(), "username1", "password1");
        Member member2 = new Member(new Person("person2", new Address(), "1@gmail.com"), "username2", "password2");

        Librarian librarian1 = new Librarian();

        LibraryCard libraryCard = new LibraryCard("101", member1, member1.getDateOfJoining(), new Date());

    }
}