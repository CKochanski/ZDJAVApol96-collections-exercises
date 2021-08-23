package pl.sda.zadanie2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Wypożyczalnia {
    private Map<String, List<Film>> movieMap;

    public Wypożyczalnia() {

        this.movieMap = new HashMap<>();
    }

    public void addMovie(Film film){
        if (movieMap.containsKey(film.getGender())){
            List<Film> films = movieMap.get(film.getGender());
            films.add(film);
            movieMap.put(film.getGender(),films);
        }else {
            List<Film> listaFilmow = new ArrayList<>();
            listaFilmow.add(film);
            movieMap.put(film.getGender(),listaFilmow);
        }
        
    }

}
