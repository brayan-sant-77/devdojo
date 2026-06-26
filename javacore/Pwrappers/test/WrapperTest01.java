package academy.devdojo.javacore.Pwrappers.test;

public class WrapperTest01 {
    public static void main(String[] args) {


        // Tipos Primitivos
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'B';

        boolean booleanP = false;

        // Wrappers
        // Temos que tomar cuidado pq o valor que temos aqui são relacionados ao polimorfismo, diferente dos tipos primitivos
        // Outro cuidado que temos que tomar cuidado é que esses caras são objetos, se formos passar parâmetros com eles
        // eles serão passados como referência

        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1; // autoboxing, o Java faz a conversão automaticamente
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'B';

        Boolean booleanW = false;

        // Podemos usar alguns metodos da classe Wrapper
        int i = intW; //unboxing, o Java se encarrega de transformar esse tipo Wrapper em um primitivo

        Integer intW2 = Integer.parseInt("1"); // Converte uma string em um valor primitivo do tipo int
        boolean valor = Boolean.parseBoolean("true"); // Retorna true apenas se a string não for nula e for igual a "true", caso contrário retorna false
        System.out.println(valor);

        System.out.println(Character.isDigit('A')); // verifica se o valor é um dígito ou não
        System.out.println(Character.isDigit('9')); // verifica se o valor é um dígito ou não
        System.out.println(Character.isLetterOrDigit('!')); // verifica se o valor é uma letra ou um dígito
        System.out.println(Character.isUpperCase('!')); // verifica se o caractere é classificado como maiúsculo
        System.out.println(Character.isLowerCase('!')); // verifica se o caractere é classificado como minúsculo
        System.out.println(Character.toUpperCase('a')); // transforma o caractere em maiúscula
        System.out.println(Character.toLowerCase('A')); // transforma o caractere em minúscula


        // As boas práticas dizem que se você conseguir criar tipos primitivos, utilize eles
        // criamos tipos primitivos para simular um valor do mundo real
        // só utiliza wrappers quando for preciso
    }
}
