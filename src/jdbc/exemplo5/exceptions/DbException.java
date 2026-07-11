package jdbc.exemplo5.exceptions;

public class DbException extends RuntimeException {
    public DbException(String msg) {
        super(msg);
    }

}
