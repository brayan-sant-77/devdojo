package academy.devdojo.javacore.Ycolecoes.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        // o HashMap não tem uma ordem específica dos elementos
        // temos que ter o equals() e o hashCode implementados
        Map<String, String> map = new HashMap<>(); // com o map, sempre trabalhamos com chave e valor

        map.put("teklado", "teclado"); // adicionamos um elemento dessa forma, passando a sua chave e valor
        map.put("mouze", "mouse");
        map.put("vc", "você");
        // se informamos uma mesma chave, ele vai alterar o valor
        map.putIfAbsent("vc2", "você"); // o putIfAbsent só vai adicionar caso ele não exista

        System.out.println(map); // podemos imprimir dessa forma

        for (String key : map.keySet()) { // imprimimos o HashMap pelo valor
            System.out.println(key + " : " + map.get(key)); // pegamos o valor baseado na chave
            
        }

        System.out.println("---------------------");
        for (String value : map.values()) {
            System.out.println(value);
        }

        System.out.println("---------------------");
        for (Map.Entry<String, String> stringStringEntry : map.entrySet()) { // pegamos a chave valor, sem precisar fazer como a primeira forma
            System.out.println(stringStringEntry.getKey() + " - " + stringStringEntry.getValue());
        }


    }
}
