package task1.info;

/**
 * class with user object
 */
public class User {

    public String login;
    public String password;
    public String confirmPassword;

    public User(String login, String password, String confirmPassword){
        this.login=login;
        this.password=password;
        this.confirmPassword=confirmPassword;
    }
}
