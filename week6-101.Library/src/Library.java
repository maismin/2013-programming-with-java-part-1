/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author Si
 */
public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<Book>();
    }
    
    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> searchResults = new ArrayList<Book>();
        
        for (Book b : books) {
            if (StringUtils.included(b.title(), title)) {
                searchResults.add(b);
            }
        }
        
        return searchResults;
    }
    
    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> searchResults = new ArrayList<Book>();
        
        for (Book b : books) {
            if (StringUtils.included(b.publisher(), publisher)) {
                searchResults.add(b);
            }
        }
        
        return searchResults;
    }
    
    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> searchResults = new ArrayList<Book>();
        
        for (Book b : books) {
            if (b.year() == year) {
                searchResults.add(b);
            }
        }
        
        return searchResults;
    }
    
    public void addBook(Book newBook) {
        books.add(newBook);
    }
    
    public void printBooks() {
        for (Book b : books) {
            System.out.println(b);
        }
    }
}
