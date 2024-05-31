import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

class Library {
    private HashMap<String, Book> books;
    private Queue<UserRequest> requests;

    public Library() {
        this.books = new HashMap<>();
        this.requests = new LinkedList<>();
    }

    public void addBook(String isbn, String title, String author, String genre, int yearOfPublication, int quantity) {
        if (!books.containsKey(isbn)) {
            books.put(isbn, new Book(isbn, title, author, genre, yearOfPublication));
        }
        books.get(isbn).addCopies(quantity);
    }

    public void requestLend(User user, String isbn) {
        if (books.containsKey(isbn)) {
            requests.add(new UserRequest(user, isbn));
            System.out.println("Solicitud de préstamo registrada para el libro con ISBN: " + isbn + " por el usuario: " + user.getName());
        } else {
            System.out.println("El libro no existe en la biblioteca.");
        }
    }

    public void processRequests() {
        while (!requests.isEmpty()) {
            UserRequest request = requests.poll();
            Book book = books.get(request.getIsbn());
            if (book != null) {
                String lend = book.lend();
                if (lend != null) {
                    System.out.println("Préstamo realizado para el libro: " + book.getTitle() + " por el usuario: " + request.getUser().getName());
                } else {
                    System.out.println("No hay copias disponibles para el libro: " + book.getTitle() + " solicitado por el usuario: " + request.getUser().getName());
                }
            }
        }
    }

    public void returnBook(String isbn) {
        if (books.containsKey(isbn)) {
            books.get(isbn).returnBook();
            System.out.println("Libro devuelto exitosamente.");
        } else {
            System.out.println("El libro no existe en la biblioteca.");
        }
    }

    public void displayBooks() {
        for (Book book : books.values()) {
            System.out.println("ISBN: " + book.getIsbn() + ", Título: " + book.getTitle() + ", Autor: " + book.getAuthor() + ", Género: " + book.getGenre() + ", Año: " + book.getYearOfPublication() + ", Copias Disponibles: " + book.getAvailableCopies());
        }
    }
}
