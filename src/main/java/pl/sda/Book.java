package pl.sda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Book {
    private String title;
    private double price;
    private int year;

    public Book(String title, double price, int year) {
        this.title = title;
        this.price = price;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", year=" + year +
                '}';
    }

    public static void main(String[] args) {
        Comparator<Book> comparator = new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return b1.getYear() - b2.getYear();
            }
        };

        List<Book> books = new ArrayList<>(List.of(
                new Book("abc", 234, 1999),
                new Book("aaa", 111, 2000),
                new Book("aa", 121, 2031),
                new Book("baa", 141, 1933)
        ));

        System.out.println(books);

        books.sort(comparator);

        System.out.println(books);

    }


}