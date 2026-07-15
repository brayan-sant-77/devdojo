package academy.devdojo.javacore.Uregex.test;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        String texto = "Levi,Eren,Mikasa,true,200";
        Scanner scanner = new Scanner(texto); // vai ler a *String*, a scanner possui um delimitador padrão que é o espaço em branco
        scanner.useDelimiter(","); // aqui informamos o delimitador que queremos

        while (scanner.hasNext()) { // o hasNext lê se existe um próximo token
            if (scanner.hasNextInt()) { // verifica se o próximo token é um inteiro
                int i = scanner.nextInt();
                System.out.println("Valor inteiro: " + i);
            } else if (scanner.hasNextBoolean()) { // verifica se o próximo token é um valor booleano
                boolean b = scanner.nextBoolean();
                System.out.println("Valor booleano: " + b);
            } else {
                System.out.println(scanner.next());
            }
        }
    }
}
