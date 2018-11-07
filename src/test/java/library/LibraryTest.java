package library;

import org.junit.*;
import static org.junit.Assert.*;

import org.junit.Test;
import java.util.*;
import java.util.Set.*;

public class LibraryTest {

    private Library library;

    /* This method is called before each test */
    @Before
    public void setup() {
	Book book1 = new Book("Pride and Prejudice", new Name("Jane", "Austen"), Genre.ROMANCE, 279);
	Book book2 = new Book("Wuthering Heights", new Name("Emily", "Bronte"), Genre.ROMANCE, 212);
	Book book3 = new Book("The President is Missing", new Name("James", "Patterson"), Genre.ACTION, 190);
	Book book4 = new Book("The Woman in White", new Name("Wilkie", "Collins"), Genre.MYSTERY, 400);

	Set<Book> bookSet = new HashSet<>();
	bookSet.add(book1);
	bookSet.add(book2);
	bookSet.add(book3);
	bookSet.add(book4);
	library = new Library(bookSet);
    }

    @Test
    public void test1() {
	Set<String> expectedTitleSet= new HashSet<>();
	expectedTitleSet.add("Pride and Prejudice");
	expectedTitleSet.add("Wuthering Heights");
	expectedTitleSet.add("The President is Missing");
	expectedTitleSet.add("The Woman in White");

        assertEquals(library.getTitles(), expectedTitleSet);
    }

    @Test
    public void test2() {
	Set<Book> expectedBookSet= new HashSet<>();
	expectedBookSet.add(new Book("Pride and Prejudice", new Name("Jane", "Austen"), Genre.ROMANCE, 279));
	expectedBookSet.add(new Book("Wuthering Heights", new Name("Emily", "Bronte"), Genre.ROMANCE, 212));
	expectedBookSet.add(new Book("The Woman in White", new Name("Wilkie", "Collins"), Genre.MYSTERY, 400));

        assertEquals(library.getLongBooks(200), expectedBookSet);
    }

    @Test
    public void test3() {
	Set<Book> expectedBookSet= new HashSet<>();
	expectedBookSet.add(new Book("The Woman in White", new Name("Wilkie", "Collins"), Genre.MYSTERY, 400));

        assertEquals(library.getLongBooks(350), expectedBookSet);
    }

    @Test
    public void test4() {
        int expectedNumPages = 1081;
        assertEquals(library.getTotalNumPages(), expectedNumPages);
    }

    @Test
    public void test5() {
	Set<Book> expectedBookSet= new HashSet<>();
	expectedBookSet.add(new Book("Pride and Prejudice", new Name("Jane", "Austen"), Genre.ROMANCE, 279));
	expectedBookSet.add(new Book("Wuthering Heights", new Name("Emily", "Bronte"), Genre.ROMANCE, 212));

        assertEquals(library.getBooksWithGenre(Genre.ROMANCE), expectedBookSet);
    }

    @Test
    public void test6() {
	Book expectedBook = new Book("The Woman in White", new Name("Wilkie", "Collins"), Genre.MYSTERY, 400);
	
        assertEquals(library.getLongestBook(), expectedBook);
    }
}
