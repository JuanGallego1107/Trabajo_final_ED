/**
 * Representa una solicitud de préstamo de un usuario para un libro específico.
 */
class UserRequest {
    private User user;
    private String isbn;

    public UserRequest(User user, String isbn) {
        this.user = user;
        this.isbn = isbn;
    }

    public User getUser() {
        return user;
    }

    public String getIsbn() {
        return isbn;
    }
}
