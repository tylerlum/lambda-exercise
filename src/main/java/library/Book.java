package library;

enum Genre {
    ROMANCE, SCIFI, HORROR, MYSTERY, ACTION;
}

public class Book {

    private String title;
    private Name author;
    private Genre genre;
    private int numPages;

    /**
     * Book Constructor
     *
     * @param title book's title
     * @param author book's author
     * @param genre book's genre
     * @param numPages number of pages in book
     *
     */
    public Book(String title, Name author, Genre genre, int numPages) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.numPages = numPages;
    }

    /**
     * @return String title of book
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return Name author's name
     */
    public Name getAuthor() {
        return author;
    }

    /**
     * @return Genre book's genre 
     */
    public Genre getGenre() {
        return genre;
    }

    /**
     * @return int number of pages in book
     */
    public int getNumPages() { 
        return numPages;
    }

    /**
     * @return String title of book
     */
    public String toString() {
        return title;
    }

    public int hashCode() {
        return title.hashCode();
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (o instanceof Book) {
            Book ob = (Book)o;
            return title.equals(ob.title) && author.equals(ob.author) && genre == ob.genre && numPages == ob.numPages;
        } else {
            return false;
        }
    }
}
