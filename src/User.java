import exception.WrongLoginException;
import exception.WrongPasswordException;

public abstract class User {

    public static void checkUserLogin(String login, String password, String confirmPassword) {
        try {
            if (login.matches("^[a-zA,0-Z9_]{1,20}+$")) {
            } else {
                throw new WrongLoginException();
            }
            if (password.equals(confirmPassword) && password.matches("^[a-zA,0-Z9_]{1,20}+$")) {
            } else {
                throw new WrongPasswordException();
            }
        } catch (WrongLoginException e) {
            throw new WrongLoginException();
        } catch (WrongPasswordException e) {
            throw new WrongPasswordException();
        }
    }
}