package academy.devdojo.javabasico.introduction;

public class Aula04Operadores {
    public static void main(String[] args) {
        //  + - * /
        int numero1 = 10;
        int numero2 = 20;
        System.out.println(numero2 + numero1);

        // % operador de resto
        int resto = 21 % 2;
        System.out.println(resto);

        // Operadores Lógicos: <, >, <=, >=, ==, !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDiferenteDeDez = 10 != 10;

        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualVinte);
        System.out.println(isDezDiferenteDeDez);

        // Operadores Lógicos: && (AND), || (OR), ! (NOT)
        int age = 17;
        double salary = 3.444;
        boolean isDentroDaLeiMaiorQueTrinta = age > 30 && salary >= 4.612;
        boolean isDentroDaLeiMenorQueTrinta = age < 30 && salary > 3881;
        System.out.println(" isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println(" isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        double valorTotalCorrente = 200;
        double valorTotalPoupanca = 10000;
        float valorPlaystation = 5000F;

        boolean isPlaystationCincoCompravel = valorTotalCorrente > valorPlaystation || valorTotalPoupanca > valorPlaystation;
        System.out.println(isPlaystationCincoCompravel);

        // Atribuição = += -= *= /= %=
        double bonus = 1800; // 1800
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2; // 3600
        System.out.println(bonus);

        //
        int contador = 0;
        contador += 1; // contador = contador + 1
        contador++; // aumenta 1, se usar o -- vai diminuir um
        ++contador;
        int contador2 = 0;
        System.out.println(++contador2); // primeiro incrementa depois executa
        System.out.println(contador2++); // primeiro executa depois incrementa

    }
}
