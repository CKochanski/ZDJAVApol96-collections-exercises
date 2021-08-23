package pl.sda.zadanie22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BookService {

    private List<Book> listOfBooks = new ArrayList<>();

    public void addBook(Book book) {
        listOfBooks.add(book);
    }

    public void removeBook(Book book) {
        listOfBooks.remove(book);
    }

    public List<Book> listOfBooks() {
        return listOfBooks;
    }

    public List<Book> listOfGivenGenre() {
        List<Book> tmp = new ArrayList<>();
        for (Book book : listOfBooks) {
            if (book.getGenre().equals("Fantasy")) {
                tmp.add(book);
            }
        }
        return tmp;
    }

    public List<Book> listofBooksBefor1999() {
        List<Book> tmp = new ArrayList<>();
        for (Book book : listOfBooks) {
            if (book.getYear() < 1999) {
                tmp.add(book);
            }
        }
        return tmp;
    }

    public Book mostExpensiveBook() {
        Comparator<Book> bookComparator = new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return (int) (o2.getPrice() - o1.getPrice());
            }

        };
        listOfBooks.sort(bookComparator);
        return listOfBooks.get(0);
    }

    public Book lessExpensiveBook() {
        Comparator<Book> bookComparator = new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return (int) (o1.getPrice() - o2.getPrice());
            }

        };
        listOfBooks.sort(bookComparator);
        return listOfBooks.get(0);


    }
}
