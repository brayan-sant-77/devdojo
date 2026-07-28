package academy.devdojo.javacore.Ycolecoes.domain;

public class Smartphone {
    private String serialNumber;
    private String brand;

    public Smartphone(String serialNumber, String brand) {
        this.serialNumber = serialNumber;
        this.brand = brand;
    }

    // precisamos seguir algumas regras no método equals
    // Reflexivo: x.equals(x) tem que ser true para tudo que for diferente de null
    // Simétrico: para x e y diferentes de null, se x.equals(y) == true logo, y.equals(x) == true
    // Transitividade: para x,y,z diferentes de null, se x.equals(y) == true, e x.equals(z) == true logo, y.equals(z) == true
    // Consistente: x.equals(x) sempre retorna true se x for diferente de null
    // para x diferente de null, x.equals(null) tem que retornar false.
    public boolean equals(Object obj) { // verifica se dois objetos Smartphone são considerados iguais
        if (obj == null) return false; // retorna false caso o objeto recebido seja nulo
        if (this == obj) return true; // se as duas referências apontam para o mesmo objeto, eles são iguais
        if (this.getClass() != obj.getClass()) return false; // verifica se os objetos pertencem à mesma classe
        Smartphone smartphone = (Smartphone) obj; // converte o objeto recebido para Smartphone
        return serialNumber != null && serialNumber.equals(smartphone.serialNumber); // compara o número de série dos dois smartphones
    }

    // Algumas regras do hashCode que precisamos seguir:
    // se x.equals(y) == true, y.hashCode() == x.hashCode(). Se o equals de x.hashCode retornar true, então o hashCode de x e de y precisam ser iguais
    // y.hashCode() == x.hashCode() não necessariamente o equals de y.equals(x) tem que ser true. Um hashCode pode ser o mesmo para dois objetos diferentes, então não é obrigatório o equals retornar true
    // x.equals(y) == false. Caso isso aconteça, o hashCode tem que ser diferente para x e y
    // y.hashCode != x.hashCode() x.equals(y) deverá ser false. Se o equals disser que eles são iguais, e os hashes forem diferentes, então o seu código está errado
    @Override
    public int hashCode() {
        return serialNumber == null ? 0: this.serialNumber.hashCode();
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "serialNumber='" + serialNumber + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
