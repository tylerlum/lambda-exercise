package library;

import java.util.*;
import java.util.stream.*;

public class Library {
    private List<Book> bookList;

    public Library(List<Book> bookList) {
        this.bookList = bookList;
    }

    public List<String> getTitles() {
	return bookList.stream().map(book -> book.getTitle()).collect(Collectors.toList());
    }

    public List<Book> getLongBooks(int minNumPages) {
        return bookList.stream().filter(book -> book.getNumPages() >= minNumPages).collect(Collectors.toList());
    }

    public Book getLongestBook() {
        return bookList.get(0);  // can this be done?
    }

    public int getTotalNumPages() {
        return bookList.stream().map(book -> book.getNumPages()).reduce(0, (a,b) -> a+b);
    }

    public List<Book> getBooksWithGenre(Genre genre) {
        return bookList.stream().filter(book -> book.getGenre() == genre).collect(Collectors.toList()); 
    }
}
