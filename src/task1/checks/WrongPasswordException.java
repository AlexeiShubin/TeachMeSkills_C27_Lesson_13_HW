package task1.checks;

/**
 * exception
 */

public class WrongPasswordException extends Throwable {

    public WrongPasswordException(String massage){
        super(massage);
    }
}
