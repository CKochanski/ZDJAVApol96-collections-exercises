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
    public List<Book> listOfGivenGenre (){
        List<Book> tmp = new ArrayList<>();
        for (Book book : listOfBooks ){
            if (book.getGenre().equals("Fantasy")){
                tmp.add(book);
            }
        }
        return  tmp;
    }
    public List<Book> listofBooksBefor1999 (){
        List<Book> tmp = new ArrayList<>();
        for (Book book : listOfBooks){
            if (book.getYear()< 1999){
                tmp.add(book);
            }
        }
        return tmp;
    }

}
