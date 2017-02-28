/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caledonian.library;
import java.util.ArrayList;
import java.util.Calendar;
import models.Book;
import models.User;

/**
 *
 * @author Alex
 */
public class LibraryDB {
    private ArrayList<Book> books;
    private ArrayList<User> users;
    
    public LibraryDB() {
        books = new ArrayList<Book>();
        users = new ArrayList<User>();
        
        Book book1 = new Book("TitleA","AuthorA");
        Book book2 = new Book("TitleB","AuthorB");
        Book book3 = new Book("TitleC","AuthorC");
        Book book4 = new Book("TitleD","AuthorD");
        
        
        // Declare old book for test
        Calendar testDate = Calendar.getInstance();
        testDate.roll(Calendar.DAY_OF_MONTH, -5);
        Book book5 = new Book("TitleE", "AuthorE", testDate);
        // End of 'Declare old book for test'
        
        User user1 = new User("UserA","PassA");
        User user2 = new User("UserB","PassB");
        User user3 = new User("UserC","PassC");
        
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        
        // Add test book
        books.add(book5);
        // End of 'Add test book'
        
        users.add(user1);
        users.add(user2);
        users.add(user3);
       
    }
    public ArrayList<Book> getBooks() {
        return books;
    }
    
    public void addBook(String title, String author) {
        Book book = new Book(title, author);
        books.add(book);
    }
    
    public User getUser(String username) {
        for(int i=0; i<users.size(); i++) {
            String currentUsername = users.get(i).getUsername();
            if(currentUsername.equalsIgnoreCase(username)) {
                return users.get(i);
            }
        }
        return null;
    }
}
