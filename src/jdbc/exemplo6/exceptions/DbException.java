package jdbc.exemplo6.exceptions;

public class DbException extends RuntimeException {
    public DbException(String msg) {
        super(msg);
    }

}
