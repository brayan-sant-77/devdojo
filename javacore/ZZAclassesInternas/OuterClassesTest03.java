package academy.devdojo.javacore.ZZAclassesInternas;

public class OuterClassesTest03 {
    private String name = "Joseph";
    // não conseguimos acessar nenhum atributo que não seja estático da classe mais externa
    static class Nested { // essa classe é como se fosse uma classe de alto nível
        private String lastName = "Joestar";
        void print() {
            System.out.println(new OuterClassesTest03().name + " " + lastName);
        }
    }
    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print(); // acessamos o método da classe estática
    }
}
