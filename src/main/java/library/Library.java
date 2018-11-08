package library;

import java.util.*;
import java.util.stream.*;

public class Library {
    private Set<Book> bookSet;

    /**
     * Library Constructor
     *
     * @param bookSet set of books that library will hold. Must be non-null
     */
    public Library(Set<Book> bookSet) {
        this.bookSet = bookSet;
    }

    /**
     * Return set of all book titles
     *
     * @return Set<String> set containing all book titles in library
     */
    public Set<String> getTitles() {
        // TODO: Implement this method in one line of code
        return null;
    }

    /**
     * Return set of all books with numPages >= minNumPages
     *
     * @param minNumPages minimum number of pages to be in the set. Must be non-negative
     *
     * @return Set<Book> set of books with at least minNumPages pages
     */
    public Set<Book> getLongBooks(int minNumPages) {
        // TODO: Implement this method in one line of code
        return null; 
    }

    /**
     * Return longest book in library by number of pages
     *
     * @return Book such that no other Book in library has more pages it
     */
    public Book getLongestBook() {
        // TODO: Implement this method in one line of code
        return null; 
    }

    /**
     * Return total number of pages that library holds
     *
     * @return int sum of the pages of all books in library
     */
    public int getTotalNumPages() {
        // TODO: Implement this method in one line of code
        return -1;
    }

    /**
     * Return set of all books with a given genre
     *
     * @param genre the genre of books that will be returned
     *
     * @return Set<Book> all books in library with genre as its genre
     */
    public Set<Book> getBooksWithGenre(Genre genre) {
        // TODO: Implement this method in one line of code
        return null;
    }

}
