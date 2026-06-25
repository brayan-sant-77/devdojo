package academy.devdojo.javacore.Oexception.exception.test;

import academy.devdojo.javacore.Oexception.exception.domain.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner scanner = new Scanner(System.in);
        String usernameDB  ="Brayan";
        String senhaDB = "1234";
        System.out.println("=== ÁREA DE LOGIN ===");
        System.out.print("Usuário: ");
        String usernameDigitado = scanner.nextLine();
        System.out.print("Senha: ");
        String senhaDigitada = scanner.nextLine();

        if (!usernameDigitado.equals(usernameDB) || !senhaDigitada.equals(senhaDB)) {
            throw new LoginInvalidoException();
        }
        System.out.println("Usuário Logado com Sucesso!");

    }
}
