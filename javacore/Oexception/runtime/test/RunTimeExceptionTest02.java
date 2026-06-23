package academy.devdojo.javacore.Oexception.runtime.test;

public class RunTimeExceptionTest02 {
    public static void main(String[] args) {
        try {
            divisao(1,0);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println("Código Finalizado");
    }

    /**
     *
     * @param a
     * @param b Não pode ser 0
     * @return
     * @throws IllegalArgumentException caso B seja 0
     */

    private static int divisao(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Argumento inválido, b não pode ser 0");
        }
        return a/b;
    }
}
