package academy.devdojo.javabasico.estruturasderepeticao;

public class Aula06EstruturasDeRepeticao2 {
    public static void main(String[] args) {
        // Imprima todos os valores pares de 0 até 1000
        for (int i = 0; i <= 1000; i += 2) {
            if (i % 2 == 0) {
                System.out.println("Contando os pares: " + i);
            }
        }
    }
}
