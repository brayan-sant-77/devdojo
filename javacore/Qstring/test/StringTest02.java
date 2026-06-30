package academy.devdojo.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "      Midorya      ";
        String numeros = "012345";
        System.out.println(nome.charAt(0)); // Retorna o char baseado on índice
        System.out.println(nome.length()); // Retorna o tamanho da string, nesse caso é 7
        System.out.println(nome.replace("o", "a")); // Troca os caracteres da primeira posição pelos caracteres da segunda posição
        System.out.println(nome.toLowerCase()); // Transforma tudo em minúsculo
        System.out.println(nome.toUpperCase()); // Transforma tudo em maiúsculo
        System.out.println(numeros.length());
        System.out.println(numeros.substring(0, 2)); // Retorna o índice da primeira posição até a segunda posição, mas o segundo valo sempre retorna um índice a menos
        System.out.println(nome.trim()); // Remove os espaços iniciais e finais em uma string, útil em login de sistemas
    }

}
