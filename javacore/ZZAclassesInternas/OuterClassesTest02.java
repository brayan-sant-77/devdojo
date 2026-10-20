package academy.devdojo.javacore.ZZAclassesInternas;

// sim, esse código tá uma gambiarra TREMENDA
// é mais usada em códigos legados
public class OuterClassesTest02 {

    final String name = "Yamamoto";

    // quando nos referimos a classes locais, estamos falando de classes que podem ser
    // declaradas em um método, ou bloco de inicialização
     void print() {
         String lastName = "Genryusai"; // precisa ser final ou efetivamente final
         class LocalClass { // os dois modificadores de acesso que podemos usar é o abstract e o final
             public void printLocal() {
                 System.out.println(name + " " + lastName);
             }
         }
         new LocalClass().printLocal(); // podemos chamar o método dessa forma
     }
    public static void main(String[] args) {
        OuterClassesTest02 outer = new OuterClassesTest02();

    }
}
