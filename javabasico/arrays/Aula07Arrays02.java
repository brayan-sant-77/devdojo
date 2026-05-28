package academy.devdojo.javabasico.arrays;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // valores padrões dos arrays:
        // byte, short, int, long, float, double = 0
        // char = '\u0000''' espaço em branco
        // boolean = false
        // String = null

        String[] names = new String[4];
        names[0] = "Ichigo";
        names[1] = "Aizen";
        names[2] = "Kyoraku";
        names[3] = "Yamamoto";

        for (int i = 0; i < names.length; i++) { // sempre que lemos um array com o .length, declaramos com <
            System.out.println(names[i]);
        }
    }
}
