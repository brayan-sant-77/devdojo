package academy.devdojo.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RunTimeExceptionTest04 {
    public static void main(String[] args) {
        // Existem casos que um metodo vai lançar mais de uma exceção

        // Nesse caso de multicatch, o Java vai tentar pegar o catch que melhor se adequa a exceção
        // Sempre tratar primeiro exceções mais específicas
        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro do IndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println("Dentro do IllegalArgumentException");
        } catch (ArithmeticException e) {
            System.out.println("Dentro do ArithmeticException");
        } catch (RuntimeException e) {
            // Caso o Java não achar um catch que mais se adeque, ele cai no catch mais genérico
            // Por essa razão não podemos colocar um tipo mais genérico a frente dos outros catchs
            System.out.println("Dentro do RuntimeException");
        }

        // Nesse caso precisamos tratar as duas exceções do metodo
        try {
            talvezLanceException();
        } catch (Exception e) { // podemos colocar Exception, que é a superclasse das duas exceções

        }

    }

    // podemos colocar várias exceções separadas por vírgula
    private static void talvezLanceException() throws SQLException, FileNotFoundException {
        // Essas duas exceções são filhas de Exception, mas não fazem parte da mesma linha de herança
    }
}
