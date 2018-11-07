package library;

enum Genre {
    ROMANCE, SCIFI, HORROR, MYSTERY, ACTION;
}

public class Book {

    private String title;
    private Name author;
    private Genre genre;

    private int numPages;
    private boolean isHardcover;

    public Book(String title, Name author, Genre genre, int numPages, boolean isHardcover) {
        this.title = title;
	this.author = author;
	this.genre = genre;
	this.numPages = numPages;
	this.isHardcover = isHardcover;
    }

    public String getTitle() {
        return title;
    }

    public Name getAuthor() {
        return author;
    }

    public Genre getGenre() {
        return genre;
    }

    public int getNumPages() { 
        return numPages;
    }

    public boolean isHardcover() {
        return isHardcover;
    }
    
    public String toString() {
        return title;
    }
}
