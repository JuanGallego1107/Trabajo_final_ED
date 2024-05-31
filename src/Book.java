import java.util.Stack;

class Book {
    private String isbn;
    private String title;
    private String author;
    private String genre;
    private int yearOfPublication;
    private Stack<String> availability;

    public Book(String isbn, String title, String author, String genre, int yearOfPublication) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.yearOfPublication = yearOfPublication;
        this.availability = new Stack<>();
    }

    public void addCopies(int quantity) {
        for (int i = 0; i < quantity; i++) {
            availability.push(isbn);
        }
    }

    public String lend() {
        if (!availability.isEmpty()) {
            return availability.pop();
        } else {
            return null;
        }
    }

    public void returnBook() {
        availability.push(isbn);
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public int getAvailableCopies() {
        return availability.size();
    }
}
