package academy.devdojo.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConversionTest01 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        // adicionando valores ao array
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        // o desempenho passando [0] é mais rápido
        Integer[] listToArray = numbers.toArray(new Integer[0]); // converte a lista em um array de inteiros
        System.out.println(Arrays.toString(listToArray));
        System.out.println("--------------------");

        Integer[] numbersArray = new Integer[3];
        numbersArray[0] = 1;
        numbersArray[1] = 2;
        numbersArray[2] = 3;

        List<Integer> arrayToList = Arrays.asList(numbersArray); // temos que tomar cuidado com esse asList() porque ele meio que cria um link com o array passado

//        arrayToList.add(19); lança uma exceção, não podemos fazer alterações quando criamos um array através do asList()
        arrayToList.set(0,12); // Trocamos o valor do índice zero para 12. Mas ele é alterado tanto no arrayToList quanto no numbersArray, porque estão linkados
        System.out.println(Arrays.toString(numbersArray));
        System.out.println(arrayToList);

        System.out.println("--------------------");
        List<Integer> numbersList = new ArrayList<>(Arrays.asList(numbersArray)); // dessa forma ele vai criar um Array com os mesmo valores, mas é permitido a alteração

        numbersList.add(14); // Não lança exceção, e adiciona o valor 14. Dessa forma podemos "quebrar" a conexão com o outro Array
        System.out.println(numbersList);

        // podemos criar Arrays ou Listas numa única linha
        List<String> strings = Arrays.asList("1", "2"); // passamos valores diretamente na lista numa única linha
        List<Integer> integers = List.of(1, 2, 3, 4, 5); // podemos também fazer dessa forma, ela foi criada mais recente a partir da versão 11 do Java
    }
}
