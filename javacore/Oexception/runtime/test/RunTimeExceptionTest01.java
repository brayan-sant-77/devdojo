package academy.devdojo.javacore.Oexception.runtime.test;

public class RunTimeExceptionTest01 {
    public static void main(String[] args) {
        // Exceções CHECKED:
        // São verificadas em tempo de compilação e obrigam o programador a tratá-las
        // Herdam diretamente de Exception

        // Exceções UNCHECKED:
        // São verificadas apenas em tempo de execução e não exigem tratamento obrigatório pelo compilador
        //Herdam de RunTimeException
        Object object = null;
        int[] nums = {1,2};


        // Tentamos acessar um índice de array que não existe
        System.out.println(nums[2]); // Aqui vamos ter uma exceção ArrayIndexOutOfBoundsException

        // Aqui nós tentamos imprimir um objeto que não foi instanciado de forma correta
        System.out.println(object.toString()); // Aqui vamos ter uma exceção NullPointerException
    }
}
