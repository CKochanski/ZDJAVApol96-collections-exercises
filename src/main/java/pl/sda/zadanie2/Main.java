package pl.sda.zadanie2;

public class Main {
    public static void main(String[] args) {
        Film film1 = new Film("horror", "Saw", false);

        Wypożyczalnia movieRental = new Wypożyczalnia();
        movieRental.addMovie(film1);

        System.out.println(movieRental.getMovieMap());
        movieRental.borrowMovie("Saw");
        System.out.println(movieRental.getMovieMap());
//        movieRental.borrowMovie("Saw");
        movieRental.borrowMovie("Harry Potter");
    }
}
