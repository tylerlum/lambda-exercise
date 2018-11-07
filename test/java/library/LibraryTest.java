package library;

import static org.junit.Assert.*;

import org.junit.Test;

public class LibraryTest {

    @Test
    public void test1() {
        Library library = new Library();
        assertEquals(1, 1);
    }

    @Test
    public void test2() {
        assertEquals(1, 0);
    }
}
