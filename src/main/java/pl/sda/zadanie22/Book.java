package pl.sda.zadanie22;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Book {
    private String title;
    private Double price;
    private int year;
    private List<Author> listOfAuthors;
    private String genre;

    public String getTitle() {
        return title;
    }

    public Double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public List<Author> getListOfAuthors() {
        return listOfAuthors;
    }

    public String getGenre() {
        return genre;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setListOfAuthors(List<Author> listOfAuthors) {
        this.listOfAuthors = listOfAuthors;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(title, book.title) && Objects.equals(price, book.price) && Objects.equals(listOfAuthors, book.listOfAuthors) && Objects.equals(genre, book.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price, year, listOfAuthors, genre);
    }

    public Book(String title, Double price, int year, List<Author> listOfAuthors, String genre) {
        this.title = title;
        this.price = price;
        this.year = year;
        this.listOfAuthors = listOfAuthors;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", listOfAuthors=" + listOfAuthors +
                ", genre='" + genre + '\'' +
                '}';
    }
}
