package jdbc.exemplo5.exceptions;

public class DbIntegrityException extends RuntimeException {
    public DbIntegrityException(String msg) {
        super(msg);
    }

}
