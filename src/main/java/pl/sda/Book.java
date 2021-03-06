package pl.sda;

import java.util.*;
import java.util.Collections;

public class Book implements Comparable<Book>{
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(book.price, price) == 0 && year == book.year && Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price, year);
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

        Collections.sort(books);

        System.out.println(books);

        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("Kaktus", 100.0f, 1999));
        bookSet.add(new Book("Kaktus", 100.0f, 1999));

        System.out.println(bookSet);

    }


    @Override
    public int compareTo(Book o) {
        return (int) (this.price - o.price);
    }
}