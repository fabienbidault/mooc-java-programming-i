/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xzero
 */
public class Book {
    
    private String title;
    private int numberOfPages;
    private int publicationYear;

    public Book(String initialTitle, int initialNumberOfPages, int initialPublicationYear) {
        this.title = initialTitle;
        this.numberOfPages = initialNumberOfPages;
        this.publicationYear = initialPublicationYear;
    }
    
    public String getTitle() {
        return this.title;
    }

    @Override
    public String toString() {
        return this.title + ", " + this.numberOfPages + " pages, " + this.publicationYear;
    }
}
