package library;

import java.util.*;

public class LibraryRunner {
    public static void main(String[] args) {
	// Test Book class
	Book book1 = new Book("Book 1", new Name("Tyler", "Lum"), Genre.ROMANCE, 100, true);
	Book book2 = new Book("Book 2", new Name("Iris", "Xie"), Genre.ROMANCE, 100, true);
	Book book3 = new Book("Book 3", new Name("Sandy", "Lum", "Ga Mun"), Genre.ACTION, 10, true);
	Book book4 = new Book("Book 4", new Name("Victor", "Lum"), Genre.ROMANCE, 190, false);

	// Test Library
	List<Book> bookList = new ArrayList<>();
	bookList.add(book1);
	bookList.add(book2);
	bookList.add(book3);
	bookList.add(book4);
	Library library = new Library(bookList);
	System.out.println(library.getTitles());
	System.out.println(library.getLongBooks(100));
	System.out.println(library.getLongBooks(150));
	System.out.println(library.getTotalNumPages());
	System.out.println(library.getBooksWithGenre(Genre.ACTION));
    }
}
