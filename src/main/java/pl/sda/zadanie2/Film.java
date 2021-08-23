package pl.sda.zadanie2;

import java.util.Objects;

public class Film {
    private String gender;
    private String tilte;
    private Boolean borrowed;

    public Film(String gender, String tilte, Boolean borrowed) {
        this.gender = gender;
        this.tilte = tilte;
        this.borrowed = borrowed;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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
        return Objects.equals(gender, film.gender) && Objects.equals(tilte, film.tilte) && Objects.equals(borrowed, film.borrowed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gender, tilte, borrowed);
    }

    @Override
    public String toString() {
        return "Film{" +
                "gender='" + gender + '\'' +
                ", tilte='" + tilte + '\'' +
                ", borrowed=" + borrowed +
                '}';
    }
}
