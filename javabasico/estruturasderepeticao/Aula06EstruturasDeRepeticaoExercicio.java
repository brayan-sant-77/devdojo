package academy.devdojo.javabasico.estruturasderepeticao;
import java.util.Scanner;

public class Aula06EstruturasDeRepeticaoExercicio {
    // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
    // Condição valorParcela >= 1000
    // Carro: 40.000 parcelado em: 40 vezes
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Informe o valor do carro que deseja comprar: ");
        double valorTotal = read.nextDouble();
        for (int numParcela= 1; numParcela <= valorTotal; numParcela++) {
            double valorParcela = valorTotal / numParcela;
            if (valorParcela < 1000) {
                break;
            }

            System.out.println("Você pode parcelar em " + numParcela + " vezes");
        }

    }
}
