package task1.checks;

/**
 * class with login checks
 */
public class CheckLogin {

    public static void checkLogin(String login) throws WrongLoginException {
        if (login.contains(" ")) {
            throw new WrongLoginException("в логине не может быть пробелов");
        }

        if (login.length() >= 20) {
            throw new WrongLoginException("максимальная длина логина 19 символов");
        }
    }
}
