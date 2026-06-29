package academy.devdojo.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        // Strings são imutáveis
        String nome = "Brayan"; // Vai ser alocada em um lugar conhecido como String constant Pool
        String nome2 = "Brayan";
        nome = nome.concat(" Oliveira"); // não podemos alterar o valor da String porque ela é imutável, aqui nós referenciamos a variável à string na pool
        System.out.println(nome);

        System.out.println(nome == nome2); // o .equals() valida se o valor das strings são iguais, para comparar a referência usamos ==

        // quando fazemos isso estamos criando: 1 variável de referência, 2 objeto do tipo string, 3 uma string no pool de string
        String nome3 = new String("Brayan"); // quando a gente cria um objeto, a string vai fazer referência ao objeto, não a pool

        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern()); // verifica se duas strings possuem o mesmo conteúdo, pois elas apontarão para o mesmo objeto em memória
    }
}
