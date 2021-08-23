package pl.sda.zadanie2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Wypożyczalnia {
    private Map<String, List<Film>> movieMap;

    public Map<String, List<Film>> getMovieMap() {
        return movieMap;
    }

    public Wypożyczalnia() {

        this.movieMap = new HashMap<>();
    }

    public void addMovie(Film film){
        if (movieMap.containsKey(film.getGenre())){
            List<Film> films = movieMap.get(film.getGenre());
            films.add(film);
            movieMap.put(film.getGenre(),films);
        }else {
            List<Film> listaFilmow = new ArrayList<>();
            listaFilmow.add(film);
            movieMap.put(film.getGenre(),listaFilmow);
        }
    }

    public void borrowMovie(String title) {
        Film szukanyFilm = null;
        for (List<Film> filmy : movieMap.values()) {
            for (Film film : filmy) {
                if (film.getTilte().equals(title)) {
                    szukanyFilm = film;
                    break;
                }
            }
            if (szukanyFilm != null) {
                break;
            }
        }

        if (szukanyFilm == null) {
            throw new MovieNotFoundException("Brak filmu " + title + " w wypożyczalni.");
        }

        if (szukanyFilm.getBorrowed()) {
            throw new MovieAlreadyBorrowedException("Film " + title + " jest obecnie wypożyczony.");
        }

        szukanyFilm.setBorrowed(true);
    }

}
