public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean available;
    
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = true;
    }
    
    // Getters and setters
    public boolean isAvailable() {
        return available;
    }
    
    public void setAvailable(boolean available) {
        this.available = available;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getIsbn() {
        return isbn;
    }
    
    @Override
    public String toString() {
        return title + " by " + author + " (ISBN: " + isbn + ")";
    }
}
