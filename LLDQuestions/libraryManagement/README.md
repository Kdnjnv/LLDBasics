Started at 6:43 PM on 13th May 2024

## Requirements

### self 
1. LMS should add details of all the books
2. How books can be searched, by name? or filtered with publication, year, genre
3. who will be using this system: librarian, all users
4. book rent:
   1. How many books are allowed per person: 10
   2. process to rent the book, search online and book online, book from counter
   3. Is there any date for returning the book? if not any fine: 10 per day
   4. how fine can be deducted: should be added in the accoutn and be cut monthly
   5. how to re-issue/extend time: User can atmost reissue 3 times a book. reissue can be done online and by counter
   6. Fine for lost book: can be calculated pro rata basis
5. book search should be efficient

### course
1. LMS system should store all details about the books and its members
2. Every book should have unique identification number as well as rack number to locate it physically
3. Every book should have associated ISBN, title, author name, publication, publication date
4. There can be multiple copies of the book, each should be recognized as book
5. Every user must have an ID card
6. A member can issue a book maximum for 15 days
7. LMS should keep the record of who reserved the book and on which date
8. the system should sent notification if book is not returned on due date

## Use case diagram
### System:
    library

### Actors:

Primary Actors:
1. Librarian
2. member

Secondary Actors:
1. system

### Use Cases:

1. Librarian:
   1. add book
   2. remove book
   3. add members
   4. Issue book
   5. collect book
   6. collect fine
   7. cancel membership
   8. Login/Logout
   9. Renew book
   10. Reserve book that is not available
   11. cancel reservation
   12. view account
2. Member:
   1. reserve a book
   2. cancel reservation of book
   2. pay fine
   3. issue book
   4. return book
   5. re-issue the book
   6. Register/Update account
   7. search catalog to search a book
   8. Login/Logout
   9. view account
3. System:
   1. Overdue notification 
   2. reservation available notification 
   3. reservation cancellation notification
4. Not associated to a any actors:
   1. pay fine
   2. issue library card
   3. By name catalogue: seach by name
   4. By publication catalogue: search by publication
   5. By Genre Catalogue: search by genre
   6. Bu Author: Search by author name


## Relationships
1. Generalization:
   **Search Catalogue** has generalization as **Serach By Name**, **Serach by Publication**, **Search By Author**
2. Association:
   actors and its usecases
    1. include:
       1. issue book -> checkout book
    2. exclude:
       1. Register new member -> Issue ICard
       2. Return book -> pay fine

# Class Diagram
We are following bottom up approach, so we start with smallest class first

1. Book:String ISBN, String name,String title, String publication, Date publicationDate, String language, String author
2. BookItem: Date borrowed, Date dueDate, double price, BookingStatus status, Date dateOfPurchase, Rack placedAt, Book book, checkoutBook()
3. Rack: int number, String locationIdentifier
4. Person: String name, Address address, String mobile, String email
5. Author: -listOfBooksPublished()
6. <abstract> User: Person person, username, password, resetPassword(), AccountStatus status
7. Member: 
   1. int totalBooksCheckedout, Date dateOfMembership, 
   2. issueBook(), returnBook(), reserveBook(), getTotalBooksCheckoutOut(), checkoutBookItem(), reserveBookItem(), renewBookItem(), checkForFine()
8. Librarian:
   1. addBookItem(BookItem), blockMember(Member), unblockMember(Member)
9. LibraryCard: String cardNumber, Date issueDate, bool active, bool isActive()
10. BookReservation: String itemId, ReservationStatus status, Date creationDate, String memId,BookReservationStatus getStatus(), BookReservation fetchReservationDetails()
11. BookLending: 
    1. Date creationDate, Date dueDate, Date returnDate, String itemId
    2. lendBook(BookItem, Member),BookLending fetchLendingDetails(BookItem book), getReturnDate()
12. <abstract>Notification: id, content, creationDate, sendNotification()
    1. PostalNotification: String address
    2. EmailNotification: String email
13. <<interface>> Search: searchByTitle(title), searchByAuthor(author), searchByPublication(publication), searchBySubject(subject)
    1. Catalog: 
       1. bookTitles, bookAuthors, bookPublications, bookSubjects
       2. implement all 4 search
14. Library: name, Address address, getAddress()
15. Enums:
    1. BookFormat: Hardcover, e-book, paperback, audiobook
    2. BookStatus: reserved, loaned, lost, available
    3. ReservationStatus: Waiting, Pending, Canceled
    4. AccountStatus: Active, Closed, Blocked, Canceled
16. CustomDataType: 
    1. Address

## Relationship between classes:
1. Association:
   1. One-way: 
      1. User -> BookItem, BookReservation
      2. 
         2. 