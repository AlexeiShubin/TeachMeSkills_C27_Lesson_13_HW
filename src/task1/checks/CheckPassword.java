package task1.checks;

/**
 * class with password checks
 */
public class CheckPassword {
    public static void checkPassword(String password, String confirmPassword) throws WrongPasswordException {
        int x=0;
        char[]symbols=password.toCharArray();
        for(char s:symbols) {
            if (!Character.isDigit(s)) {
                x++;
                break;
            }
        }
        if (password.length() >= 20) {
            throw new WrongPasswordException(" максимальное количество символов в пароле 20");
        }
        if (password.contains(" ") || confirmPassword.contains(" ")) {
            throw new WrongPasswordException(" в пароле не должно быть пробелов");
        }
        if (x<1) {
            throw new WrongPasswordException("Пароль должен содержать минимум одну цифру");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают ");
        }

    }
}
