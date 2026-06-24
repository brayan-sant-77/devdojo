package academy.devdojo.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException{
        CriarNovoArquivo();
    }
    // Existem alguns prós e contras em fazer o tratamento de exceção com try-catch
    // O lado positivo é o próprio tratamento de exceção, evitando erro em tempo de execução e problemas no código
    // O lado negativo é que se alguém chamar o metodo, não possui a opção de fazer o tratamento do jeito dele
    // Existem casos que o tratamento de exceção é benéfico, e outros casos que não são


    // Podemos fazer um metodo "híbrido" onde você captura a exceção, e relança ela

    // Quando isso é útil?
    // Imagine que você tem um carrinho de compras, e você tenta efetuar um pagamento
    // quando você tenta efetuar esse pagamento, o pagamento pode falhar
    // quando o pagamento falha, você quer ver no seu console que ele falhou, e quando ele falha você quer dar opção ao cliente
    // para ele fazer uma nova tentativa, ou você mesmo fazer uma nova tentativa após algumas horas
    // então você quer capturar a exceção, quer mostrar no console, e quer relançar essa exceção para quem tá chamando

    // Exemplo do "híbrido"
    public static void CriarNovoArquivo() throws IOException{
        File file = new File("arquivo\\exemplo.txt");
        // Tratamos a exceção
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo Criado! " + isCriado);
        } catch (IOException e) {
            e.printStackTrace(); // exibimos no console, mas não sabemos o que quem chamou o metodo quer fazer
            throw e;
        }



        // Se você estiver criando um metodo privado, não faz muito sentido você usar um throws IOException
        // porque ninguém fora da classe consegue acessar, sendo o try-catch uma melhor alternativa de tratamento

        // Quando usamos um throws IOException, a responsabilidade do tratamento do metodo é para quem tá chamando ele
        // Usar um throws IOException em um metodo público seria mais interessante, porque você não sabe quem vai chamar
        // esse metodo
    }
}
