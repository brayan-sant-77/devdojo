package academy.devdojo.javacore.Aintroducaoclasses.test;

import academy.devdojo.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.marca = "Eclipse";
        carro1.modelo = "Mitsubichi";
        carro1.ano = 1998;

        carro2.marca = "Honda";
        carro2.modelo = "Civic";
        carro2.ano = 2024;

        carro1 = carro2; // Referência de Objetos

        System.out.println("Marca: " + carro1.marca);
        System.out.println("Modelo: " + carro1.modelo);
        System.out.println("Ano: " + carro1.ano);

        System.out.println("-----------------");

        System.out.println("Marca: " + carro2.marca);
        System.out.println("Modelo: " + carro2.modelo);
        System.out.println("Ano: " + carro2.ano);
    }
}
