package LLDQuestions.libraryManagement;

import java.util.List;

public class Librarian extends User{
    private List<Member> members;
    private List<Member> blocklistedMembers;
    private List<BookItem> books;

    public Librarian(Person person, String username, String password) {
        super(person, username, password);
    }

    public Librarian() {
        super(new Person(), "USERNAME", "PASSWORD");
    }

    @Override
    public void resetPassword() {
        System.out.println("reset password");
    }

    public void addMember(Member member) throws IllegalAccessException {
        if (!blocklistedMembers.contains(member)) {
            members.add(member);
        } else {
            throw new IllegalAccessException("member blocklisted");
        }
    }

    public void removeMember(Member member) {
        members.remove(member);
    }

    public void blockMember(Member member) {
        removeMember(member);
        blocklistedMembers.add(member);
    }

    public void addBookItem(BookItem bookItem) {
        books.add(bookItem);
    }

    public void removeBookItem(BookItem bookItem) {
        books.remove(bookItem);
    }
}
