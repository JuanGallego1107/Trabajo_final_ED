import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        LibraryDataBase.initializeLibrary(library);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenú Principal:");
            System.out.println("1. Agregar libro");
            System.out.println("2. Solicitar préstamo");
            System.out.println("3. Procesar solicitudes de préstamo");
            System.out.println("4. Devolver libro");
            System.out.println("5. Mostrar libros disponibles");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1:
                    System.out.print("Ingrese ISBN: ");
                    String isbn = scanner.nextLine();
                    System.out.print("Ingrese título: ");
                    String title = scanner.nextLine();
                    System.out.print("Ingrese autor: ");
                    String author = scanner.nextLine();
                    System.out.print("Ingrese género: ");
                    String genre = scanner.nextLine();
                    System.out.print("Ingrese año de publicación: ");
                    int yearOfPublication = scanner.nextInt();
                    System.out.print("Ingrese cantidad de copias: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    library.addBook(isbn, title, author, genre, yearOfPublication, quantity);
                    System.out.println("Libro agregado exitosamente.");
                    break;
                case 2:
                    System.out.print("Ingrese el numero de identificación de usuario: ");
                    String userId = scanner.nextLine();
                    System.out.print("Ingrese nombre del usuario: ");
                    String userName = scanner.nextLine();
                    System.out.print("Ingrese número de teléfono del usuario: ");
                    String phoneNumber = scanner.nextLine();
                    User user = new User(userId, userName, phoneNumber);
                    System.out.print("Ingrese ISBN del libro para solicitar préstamo: ");
                    isbn = scanner.nextLine();
                    library.requestLend(user, isbn);
                    break;
                case 3:
                    library.processRequests();
                    break;
                case 4:
                    System.out.print("Ingrese ISBN del libro a devolver: ");
                    isbn = scanner.nextLine();
                    library.returnBook(isbn);
                    break;
                case 5:
                    library.displayBooks();
                    break;
                case 6:
                    System.out.println("Saliendo del sistema.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        }
    }
}
