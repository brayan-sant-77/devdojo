package academy.devdojo.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RunTimeExceptionTest05 {
    public static void main(String[] args) {
        // Podemos colocar exceções que não estão na mesma linha de herança, em um mesmo catch separados por um | (pipe)

        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException ");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro do IndexOutOfBoundsException");
        } catch (RuntimeException e) {
            // Caso o Java não achar um catch que mais se adeque, ele cai no catch mais genérico
            // Por essa razão não podemos colocar um tipo mais genérico a frente dos outros catchs
            System.out.println("Dentro do RuntimeException");
        }

        // Como essas duas execeções não estão na mesma linha de herança, podemos colocar elas em um mesmo catch
        // Mas sempre tomar cuidado para não fazer isso com execções que estão na mesma linha de herança
        try {
            talvezLanceException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    // podemos colocar várias exceções separadas por vírgula
    private static void talvezLanceException() throws SQLException, FileNotFoundException {
        // Essas duas exceções são filhas de Exception, mas não fazem parte da mesma linha de herança
    }
}
