package academy.devdojo.javacore.Oexception.exception.domain;

public class LoginInvalidoException extends Exception{
    public LoginInvalidoException() {
        super("Login ou senha inválido!");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
