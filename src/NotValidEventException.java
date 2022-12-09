public class NotValidEventException extends RuntimeException {
    public NotValidEventException() {
        super("Заполнены не все данные!");
    }
}
