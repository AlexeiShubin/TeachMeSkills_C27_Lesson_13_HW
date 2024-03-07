package task1.info;

/*
  class with client registration methods
 */

import task1.checks.CheckLogin;
import task1.checks.CheckPassword;
import task1.checks.WrongLoginException;
import task1.checks.WrongPasswordException;

import java.util.Scanner;

public class Registration {

    private static User registration(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Введите логин: ");
        String login= scanner.next();
        System.out.print("Введите пароль: ");
        String password= scanner.next();
        System.out.print("Повторите пароль: ");
        String confirmPassword= scanner.next();
        return new User(login, password, confirmPassword);
    }

    public static void registration_check(){
        User user=Registration.registration();
        try {
            CheckLogin.checkLogin(user.login);
            CheckPassword.checkPassword(user.password, user.confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }

    }
}
