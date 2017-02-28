/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Alex
 */
public class User {
    
    private String username;
    private String password;
    private boolean accountType;
    private double fineAmount;
    private ArrayList<Book> books;
    
    public User(String username, String password) {
        this.username = username;
        this.password = password;
        boolean accountType = false;
        double fineAmount = 0.00;
        books = new ArrayList<Book>();
    }
    
    public double getFineAmount() {
        return fineAmount;
    }
    
    public void addBook(Book book) {
        books.add(book);
    }
    
    public ArrayList<Book> getBooks() {
        return books;
    }
    
    public String getUsername() {
        return username;
    }
    
    public void recordFine() {        
        for(int i=0; i<books.size(); i++) {
           books.get(i).calculateFine();
           fineAmount += books.get(i).getFineAmount();
        }
    }
}
