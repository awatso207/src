/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
import java.util.UUID;
import java.util.Calendar;
/**
 *
 * @author Alex
 */
public class Book {
    private String title;
    private String author;
    private UUID id;
    private Calendar dateOfReturn;
    private double fine;
   
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        id = UUID.randomUUID();
        dateOfReturn = null;
    }
    
    // Test constructor
    public Book(String title, String author, Calendar dateOfReturn) {
        this.title = title;
        this.author = author;
        id = UUID.randomUUID();
        this.dateOfReturn = dateOfReturn;
    }
    
    public String getTitle() {
        return title;
    }
    
    public UUID getID() {
        return id;
    }
    
    public void setDateOfReturn() {
        dateOfReturn = Calendar.getInstance();        
        dateOfReturn.roll(Calendar.DAY_OF_MONTH, 14);
    }
       
    public Calendar getDateOfReturn() {
        return dateOfReturn;
    }
    
    public void calculateFine() {
        long currentDateInMilliseconds = Calendar.getInstance().getTimeInMillis();
        long dateOfReturnInMilliseconds = dateOfReturn.getTimeInMillis();
        long timeDifference = currentDateInMilliseconds - dateOfReturnInMilliseconds;
        long timeDifferenceInDays = timeDifference / 1000 / 60 / 60 / 24;
        
        System.out.println(timeDifferenceInDays);
        
        if(timeDifferenceInDays > 1) {
            fine = 0;
            fine += 1 * Math.floor(timeDifferenceInDays);
        }
    }
    
    public double getFineAmount() {
        return fine;
    }
}
