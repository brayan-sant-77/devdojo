package academy.devdojo.javacore.Pwrappers.test;

public class WrapperTest01 {

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
    Integer intW = 1;
    Long longW = 10L;
    Float floatW = 10F;
    Double doubleW = 10D;
    Character charW = 'B';
    Boolean booleanW = false;


    // As boas práticas dizem que se você conseguir criar tipos primitivos, utilize eles
    // criamos tipos primitivos para simular um valor do mundo real
    // só utiliza wrappers quando for preciso
}
