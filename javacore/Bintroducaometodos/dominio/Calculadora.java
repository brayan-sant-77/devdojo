package academy.devdojo.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somaDoisValores() {
        System.out.println(10+10);
    }

    public void subtraiDoisValores() {
        System.out.println(21-2);
    }

    // Boas práticas: não passar mais de dois parâmetros em um método
    public void multiplicaDoisValores(int x, int y) {
        System.out.println(x * y);
    }

    public double divideDoisValores(double a, double b) {
        if (b == 0) {
            return 0;
        }
        return a / b;
    }

    public double divideDoisValores2(double a, double b) {
        if (b != 0) {
            return a/b;
        }
        return 0;
    }

    public void imprimeDivisao (double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Não existe divisão por zero");
            return; // essa forma só pode usar quando o método é void
        }
        System.out.println(num1/num2);
    }

    public void alteraDoisValores (int number1, int number2) {
        number1 = 99;
        number2 = 33;
        System.out.println("Dentro do alteraDoisValores");
        System.out.println("Num1: " + number1);
        System.out.println("Num2: " + number2);
    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for(int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros) { // o VarArgs precisa ser o último parâmetro
        int soma = 0;
        for(int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
}
