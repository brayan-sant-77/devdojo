package academy.devdojo.javabasico.arrays;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numeros = new int[4];
        int[] valores = {19,2,43,66,54,32};
        int[] numeros2 = new int[]{1,2,3,4,5};

        //for (int i = 0; i < numeros2.length; i++) {
        //    System.out.println(valores[i]);
        //}
        for(int num:numeros2){
            System.out.println(num);
        }
    }
}
