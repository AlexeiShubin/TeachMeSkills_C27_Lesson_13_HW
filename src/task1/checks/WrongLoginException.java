package task1.checks;

/**
 * exception
 */
public class WrongLoginException extends Throwable {

    public WrongLoginException(String massage){
        super(massage);
    }

}
