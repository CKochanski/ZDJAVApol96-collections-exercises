package pl.sda.zadanie2;

public class MovieAlreadyBorrowedException extends RuntimeException{
    MovieAlreadyBorrowedException(String message){
        super(message);
    }
}
