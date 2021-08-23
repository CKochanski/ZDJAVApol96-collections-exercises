package pl.sda.zadanie22;

import java.util.ArrayList;
import java.util.List;

public class BookService {

    private List<Book> listOfBooks = new ArrayList<>();

    public void addBook (Book book){
        listOfBooks.add(book);
    }
    public void removeBook (Book book){
        listOfBooks.remove(book);
    }
    public List<Book> listOfBooks (){
        return listOfBooks;
    }

}
