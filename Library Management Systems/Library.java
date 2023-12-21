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

// Library class is to manage the collection of the book such as issued book and return book

public class Library {
    //Class field
    private String libraryName;
    private String libraryAddress;
    private Book[] theInventory;
    private int inventoryCount;
    private Book book;

    /**
     * Constructor of Library
     * 
     * @param theLibraryAddress
     * @param theLibraryName
     */
    public Library(String theLibraryAddress, String theLibraryName) {
        this.libraryAddress = theLibraryAddress;
        this.libraryName = theLibraryName;
        this.theInventory = new Book[10];
        this.inventoryCount = 0;
    }   
    /**
     * 
     * @return name of library
     */
    public String getNameOfLibrary() {
        return this.libraryName;
    }
    /**
     * 
     * @return the library name and address
     */
    public String printAddress() {
        return this.libraryName + "\n" + this.libraryAddress;
    }
    public static void printOpeningHours() {
        System.out.println("9 AM to 5 PM");
    }
    /**
     * Add book object with given parameter to the library in the array in the class field and constructor
     * 
     * @param theTitleOfTheBook
     * @param theAuthorOfTheBook
     * @param thePublisherOfTheBook
     * @param theYearPublished
     * @param theGenreOfTheBook
     */
    public void addBook(String theTitleOfTheBook, String theAuthorOfTheBook, String thePublisherOfTheBook,
                        int theYearPublished ,String theGenreOfTheBook) {
        this.book = new Book(theTitleOfTheBook, theAuthorOfTheBook, thePublisherOfTheBook, theYearPublished, theGenreOfTheBook);
        
        this.theInventory[inventoryCount] = this.book; 
        inventoryCount++;
    }
    /**
     * 
     * @return print all the book title in the library
     */
    public String printInventory() {
        String print = "";
        for (int i = 0; i < inventoryCount; i++) {
            print += theInventory[i].getTitle() + "\n";
        }
        return print;
    }
    /**
     * Search through the array for book using name
     * @param theName
     */
    public void search(String theName) { 
        boolean isFound = false;   
        for (int i = 0; i < inventoryCount; i++) {
            if (theInventory[i].getTitle() == theName) {
                isFound = true;
                System.out.println(theInventory[i].toString() + "\n");
            }
        }
        if (isFound == false) {
            System.out.println("Book not found!");
        }
    }
    /**
     * Make the book unavaible to issue again
     * @param theName
     */
    public void issueBook(String theName) {
        boolean isFound = false;   
        for (int i = 0; i < inventoryCount; i++) {
            if (theInventory[i].getTitle().equals(theName)) {  
                theInventory[i].issueBook();
                isFound = true;
            }
        }
        if (isFound == false) {
            System.out.println("Book not in the inventory. Cannot issue!");
        }
    }
    /**
     * 
     * @return string all availble book
     */
    public String printAvailableBooks() {
        String print = "";
        for (int i = 0; i < inventoryCount; i++) {
            if (theInventory[i].isIssued() == false) {
            print += theInventory[i].getTitle() + "\n";
            }
        }
        return print;
    }
    /**
     * Make the book avaialbe to be issued again
     * @param theName
     */
    public void returnBook(String theName) {
        boolean isFound = false;   
        for (int i = 0; i < inventoryCount; i++) {
            if (theInventory[i].getTitle().equals(theName)) {
                theInventory[i].returnBook();;
                isFound = true;
            }
        }
        if (isFound == false) {
            System.out.println("Book not in the inventory. Cannot take return!");
        }
    }
    /**
     * 
     * @return the total of the book in the library
     */
    public int getInventoryCount() {
        int count = 0;
        for (int i = 0; i < inventoryCount; i++) {
            count++;
        }
        return count;
    }
    /**
     * 
     * @return total number of book in library
     */
    public int getNumberOfIssuedBooks() {
        int count = 0;
        for (int i = 0; i < inventoryCount; i++) {
            if (theInventory[i].isIssued() == true) {
                count++;
            }
        }
        return count;
    }
}
