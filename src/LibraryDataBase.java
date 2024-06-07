/**
 * Clase para inicializar una biblioteca con un conjunto de libros predeterminados.
 */
public class LibraryDataBase {

    /**
     * Inicializa la biblioteca con una lista de libros predeterminados.
     *
     * @param library La instancia de Library a ser inicializada.
     */
    public static void initializeLibrary(Library library) {
        library.addBook("12345", "The Great Gatsby", "F. Scott Fitzgerald", "Fiction", 1925, 5);
        library.addBook("23456", "To Kill a Mockingbird", "Harper Lee", "Fiction", 1960, 3);
        library.addBook("34567", "1984", "George Orwell", "Dystopian", 1949, 4);
        library.addBook("45678", "The Catcher in the Rye", "J.D. Salinger", "Fiction", 1951, 2);
        library.addBook("56789", "Brave New World", "Aldous Huxley", "Dystopian", 1932, 3);
        library.addBook("67890", "Fahrenheit 451", "Ray Bradbury", "Dystopian", 1953, 4);
        library.addBook("78901", "Moby-Dick", "Herman Melville", "Adventure", 1851, 2);
        library.addBook("89012", "Pride and Prejudice", "Jane Austen", "Romance", 1813, 3);
        library.addBook("90123", "War and Peace", "Leo Tolstoy", "Historical", 1869, 5);
        library.addBook("11223", "Ulysses", "James Joyce", "Modernist", 1922, 2);
    }
}
