package academy.devdojo.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(4);
        numbers.add(0);
        // (-(ponto de inserção) -1)
        // index 0,1,2,3
        // value 0,3,4,5
        Collections.sort(numbers); // para utilizar o BinarySearch, precisamos ter uma lista ordenada
        // o BinarySearch vai retornar o índice onde a chave foi encontrada
        System.out.println(Collections.binarySearch(numbers, 3)); // passamos a lista e a chave que queremos encontrar
    }
}
