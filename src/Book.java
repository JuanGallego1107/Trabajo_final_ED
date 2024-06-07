import java.util.Stack;

/**
 * Representa un libro en una biblioteca.
 */
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

    /**
     * Añade copias del libro a la disponibilidad.
     *
     * @param quantity Cantidad de copias a añadir.
     */
    public void addCopies(int quantity) {
        for (int i = 0; i < quantity; i++) {
            availability.push(isbn);
        }
    }

    /**
     * Presta una copia del libro si hay disponibilidad.
     *
     * @return ISBN del libro prestado o null si no hay copias disponibles.
     */
    public String lend() {
        if (!availability.isEmpty()) {
            return availability.pop();
        } else {
            return null;
        }
    }

    /**
     * Devuelve una copia del libro.
     */
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
