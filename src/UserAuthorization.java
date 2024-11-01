import exception.WrongLoginException;
import exception.WrongPasswordException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserAuthorization {
    private static final String REGEX = "^[a-zA-Z,\\d_]{1,20}$";

    public static void checkUserLogin(String login, String password, String confirmPassword) {
        if (login == null || password == null || confirmPassword == null) {
            System.out.println("Вы оставили пустое поле");
            return;
        }
        if (!Pattern.compile(REGEX).matcher(login).find()) {
            throw new WrongLoginException("Ошибка в логине");
        }
        if (!password.equals(confirmPassword) && !password.matches(REGEX)) {
            throw new WrongPasswordException("Ошибка в пароле");
        }
    }
}