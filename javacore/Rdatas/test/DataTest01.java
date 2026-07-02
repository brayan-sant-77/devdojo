package academy.devdojo.javacore.Rdatas.test;

import java.util.Date;

public class DataTest01 {
    public static void main(String[] args) {
        // A classe Date está obsoleta hoje em dia
        Date date = new Date(); // o Date trabalha com um long representando os milissegundos
        System.out.println(date.getTime()); // retorna a quantidade de milissegundos desde 01/01/1970
        System.out.println(date); // retorna a data atual
    }
}
