package academy.devdojo.javabasico.estruturacondicional;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int age = 15;
        boolean isAutorizadoComprarBebida = age >= 18;
        // !

        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcoólica");
        } else {
            System.out.println("Não autorizado a comprar bebida alcoólica");
        }

        if (!isAutorizadoComprarBebida) { // Utilizando sinal de negação (!)
            System.out.println("Não autorizado a comprar bebida alcoólica");
        }
        
        System.out.println("Fora do IF");
    }

}
