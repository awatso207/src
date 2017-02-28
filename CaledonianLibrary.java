/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caledonian.library;
import models.Book;
import models.User;

/**
 *
 * @author Alex
 */
public class CaledonianLibrary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          LibraryDB db1 = new LibraryDB();
          
          
          // Add 'old' test book to user and test values by logging before and after running recordFine method on user.          
          db1.getUser("UserA").addBook(db1.getBooks().get(4));
          
          System.out.println("Fine before recordFine() is run:  " + db1.getUser("UserA").getFineAmount());
          
          db1.getUser("UserA").recordFine();
          
          System.out.println("Fine after recordFine() is run:  " + db1.getUser("UserA").getFineAmount());
    }
    
}
