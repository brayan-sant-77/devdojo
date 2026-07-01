package academy.devdojo.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Brayan Oliveira";
        nome.concat(" dos Santos");
        System.out.println(nome);
        // se não passarmos nada no () ele cria uma capacidade de 16 caracteres, por padrão
        StringBuilder sb = new StringBuilder("Brayan Oliveira"); // a imutabilidade dela até o momento que você cria a String ela não existe
        // sb = nome - Isso não existe porque são objetos completamente diferentes
        sb.append(" dos Santos"); // serve como uma concatenação
        sb.reverse(); // inverte a ordem da String
        sb.reverse(); // retorna a String ao normal
        sb.delete(0, 3); // Deleta os caracteres, de um indice até o outro
        System.out.println(sb);

        // String são imutáveis, toda vez que alteramos algo em uma String normal, estamos criando uma nova String no Pool de String
        // Quando trabalhamos com o StringBuilder nos trabalhamos diretamente com a String dentro da memória

        // Sempre temos que tomar cuidado com o metodo, para saber se ele retorna uma String ou uma StringBuilder, pra saber se estamos alterando o valor dentro daquele objeto
    }
}
