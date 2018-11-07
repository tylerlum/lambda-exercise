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
	return bookSet.stream().map(book -> book.getTitle()).collect(Collectors.toSet());
    }

    /**
     * Return set of all books with numPages >= minNumPages
     *
     * @param minNumPages minimum number of pages to be in the set. Must be non-negative
     *
     * @return Set<Book> set of books with at least minNumPages pages
     */
    public Set<Book> getLongBooks(int minNumPages) {
        return bookSet.stream().filter(book -> book.getNumPages() >= minNumPages).collect(Collectors.toSet());
    }

    /**
     * Return longest book in library by number of pages
     *
     * @return Book such that no other Book in library has more pages it
     */
    public Book getLongestBook() {
        return bookSet.stream().reduce((book1,book2) -> book1.getNumPages() >= book2.getNumPages() ? book1 : book2).get(); 
    }

    /**
     * Return total number of pages that library holds
     *
     * @return int sum of the pages of all books in library
     */
    public int getTotalNumPages() {
        return bookSet.stream().map(book -> book.getNumPages()).reduce(0, (a,b) -> a+b);
    }

    /**
     * Return set of all books with a given genre
     *
     * @param genre the genre of books that will be returned
     *
     * @return Set<Book> all books in library with genre as its genre
     */
    public Set<Book> getBooksWithGenre(Genre genre) {
        return bookSet.stream().filter(book -> book.getGenre() == genre).collect(Collectors.toSet()); 
    }

}
