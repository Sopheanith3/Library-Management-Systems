/**
 * @author Sopheanith Ny
 * Course : TCSS 143 A, SP 23
 * Instructor : Sikha Pentyala
 *
 * PA1 : Library Management System (LMS)
 * LMS has two libraries, where each library has a book rack of size 10.
 * This means a library can hold upto a maximum of 10 books only.
 * A book is identifibale through title (Each title is unique).
 * @version 1.0
 */

// Book class that represent the book type 

public class Book {
    /**
     * Class Field
     */
    private String titleOfTheBook, authorOfTheBook, publisherOfTheBook, genreOfTheBook;

    private int yearPublished;

    private boolean isIssued; 

    //Getter for title
    public String getTitle() {
        return titleOfTheBook;
    }
    //Getter for Author
    public String getAuthor() {
        return authorOfTheBook;
    }
    //Getter fr Publish year
    public int getPublishYear() {
        return yearPublished;
    }
    //Getter for Genre
    public String getGenre() {
        return genreOfTheBook;
    }
    //Returns the issue status of the book
    public boolean isIssued() {
        return isIssued;
    }
    //Getter for Publisher
    public String getPublisher() {
        return publisherOfTheBook;
    }

    /**
     * Constructor for the Book class
     * 
     * @param theTitleOfTheBook
     * @param theAuthorOfTheBook
     * @param thePublisherOfTheBook
     * @param theYearPublished
     * @param theGenreOfTheBook
    */
    public Book(String theTitleOfTheBook, String theAuthorOfTheBook, String thePublisherOfTheBook,
                int theYearPublished ,String theGenreOfTheBook) {           
        this.titleOfTheBook = theTitleOfTheBook;
        this.authorOfTheBook = theAuthorOfTheBook;
        this.publisherOfTheBook = thePublisherOfTheBook;
        this.yearPublished = theYearPublished;
        this.genreOfTheBook = theGenreOfTheBook;
        isIssued = false;
    }
    /**
     * Issue given book out of the Library
     */
    public void issueBook() {
        if (isIssued == false) {
            isIssued = true;
        } else {
            System.out.println("Book not in the inventory. Cannot issue!");
        }
    }
    /**
     * Return the given book and sets the issue to a parameter
     */
    public void returnBook() {
        if (isIssued == true) {
            isIssued = false;
        } else {
            System.out.println("Book not issued. Cannot Return");
        }
    }
    /**
     * Return the book as neatly written string
     * @return String with book title, author. genre, publisher and year
     */
    public String toString() {
        String string = String.format("Book Title : %s%n Book Author : %s%n Book Genre : %s%n Book Publisher : %s%n Book Year : %d",
                        titleOfTheBook, authorOfTheBook, genreOfTheBook, publisherOfTheBook, yearPublished);
        return string;
    }
}

