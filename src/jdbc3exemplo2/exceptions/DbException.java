package jdbc3exemplo2.exceptions;

public class DbException extends RuntimeException {
    public DbException(String msg) {
        super(msg);
    }

}
