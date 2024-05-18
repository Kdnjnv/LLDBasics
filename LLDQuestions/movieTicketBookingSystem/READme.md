# Movie Ticket Booking System

## Requirements:

## Class Diagram:

1. <absract>Seat: String seatNo, SeatStatus status, double rate, isAvailable, setSeat(), setRate()
   1. SilverSeat: 
   2. GoldSeat:
   3. PlatinumSeat:
2. Hall: String hallId, List<ShowTime> shows, findcurrentShow()
3. Show: String id, Date startTime, Date endTime, Movie movie, List<Seat> silverSeats, List<Seat> goldSeats, List<Seat> platinumSeats
   1. void reserveSeats(List<Seat> seats)
4. Cinema: String cinemaId, List<Hall> halls, city
5. <<abstract>>Person: Fname, Lname, email, number, Address
6. Customer: selectSeats(), Booking(List<Seat> seats), payBill(), List<Tickets> bookedTickets, List<Tickets> canceledTickets
7. Admin: addShow(), removeShow(), updateShow(), addMovie(), removeMovie()
8. BookingAgent: bookTicket(), pay()
9. <abstract>Notification: id, message, sendMessage()
   1. PhoneNotification: phoneNumber, 
   2. EmailNotification: email, 
10. System: sendNewMovieNotification(), sendCancellationNotification()
11. MovieTicket: String ticketId, ShowTime showTime, List<Seats> seats, movie, PaymentStatus(Booked, Canceled, rejected)
12. Payment: String transactionId, double amount, PaymentStatus, timestamp, makePayment()
    1. Cash: 
    2. Card: name, cardNumber, ....
13. Movie: name, genre, releaseDate, language, duration, List<ShowTime> shows
14. catalogue: movieTitle<Map<String, List<Movie>>>, movieGenre, movieLanguage, movieReleaseDate
15. <<interface>> search: searchByTitle, searchByGenre, searchByLanguage, searchByReleaseDate
16. Booking: bookingId, amount, totalSeats, createdOn, status, payment, tickets, seat
17. ShowTime: showId, startTime, date, duration, List<Seat> seats, showAvailableSeats()

## Advance Questions:
1. How to handle concurrency:
   1. Allow users to select same seat and assign version to the seat.
   2. Lock the seat once one customer initiated payment
      1. If payment successfull: 
         1. ticket will be booked, and the seat version and system version will be incremented.
         2. When 2nd user to for payment, it will first validate the version. And then it will ask user to initiate booking again.
      2. If payment not successfull:
         1. lock expires after sometime and second user can book the seat.

2. How Discount can be added:
   1. Create a Discount class and add multiple methods like applyFixedDiscount(), applyPercentageDiscount(), applySpecialDiscount()
   2. add an instance of Discount in Booking class.
   3. Initialize Discount with NULL Object pattern 