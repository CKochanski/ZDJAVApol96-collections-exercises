package pl.sda.zadanie2;

import java.util.Objects;

public class Film {
    private String genre;
    private String tilte;
    private Boolean borrowed;

    public Film(String gender, String tilte, Boolean borrowed) {
        this.genre = gender;
        this.tilte = tilte;
        this.borrowed = borrowed;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTilte() {
        return tilte;
    }

    public void setTilte(String tilte) {
        this.tilte = tilte;
    }

    public Boolean getBorrowed() {
        return borrowed;
    }

    public void setBorrowed(Boolean borrowed) {
        this.borrowed = borrowed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return Objects.equals(genre, film.genre) && Objects.equals(tilte, film.tilte) && Objects.equals(borrowed, film.borrowed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(genre, tilte, borrowed);
    }

    @Override
    public String toString() {
        return "Film{" +
                "gender='" + genre + '\'' +
                ", tilte='" + tilte + '\'' +
                ", borrowed=" + borrowed +
                '}';
    }

}
