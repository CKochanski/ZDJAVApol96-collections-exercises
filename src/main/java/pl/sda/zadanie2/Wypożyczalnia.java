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
        String gatunekDodawanegoFilmu = film.getGenre();
        if (movieMap.containsKey(gatunekDodawanegoFilmu)){
            List<Film> filmyDlaGatunkuDodawanegoFilmu = movieMap.get(gatunekDodawanegoFilmu);
            filmyDlaGatunkuDodawanegoFilmu.add(film);
            movieMap.put(gatunekDodawanegoFilmu,filmyDlaGatunkuDodawanegoFilmu);
        }else {
            List<Film> listaFilmow = new ArrayList<>();
            listaFilmow.add(film);
            movieMap.put(gatunekDodawanegoFilmu,listaFilmow);
        }
    }

    public void borrowMovie(String title) {
        Film szukanyFilm = null;
        for (List<Film> filmyWDanymGatunku : movieMap.values()) {
            for (Film filmWDanymGatunku : filmyWDanymGatunku) {
                if (filmWDanymGatunku.getTilte().equals(title)) {
                    szukanyFilm = filmWDanymGatunku;
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
