package exception;

public class WrongLoginException extends RuntimeException {
    public WrongLoginException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongLoginException() {
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
