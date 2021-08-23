package pl.sda.zadanie2;

public class MovieNotFoundException extends RuntimeException {
    public MovieNotFoundException(String message){
        super(message);
    }

}
