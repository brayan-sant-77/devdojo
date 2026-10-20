package academy.devdojo.javacore.ZZAclassesInternas;

public class OuterClassesTest01 {
    private String name = "Kurosaki Ichigo";

    // Nested
    class Inner { // essa classe possui acesso a todos os objetos da classe externa
        public void printOuterClassAttribute() {
            System.out.println(name);
            System.out.println(this); // esse this vai se referir à classe interna
            System.out.println(OuterClassesTest01.this); // esse this faz referência ao this da classe externa
        }

    }
    public static void main(String[] args) { // para criar um objeto da classe interna, é necessário um objeto da classe externa
        OuterClassesTest01 outerClass = new OuterClassesTest01();
        Inner inner = outerClass.new Inner(); // criamos um objeto da classe interna por meio de um objeto da classe externa
        Inner inner2 = new OuterClassesTest01().new Inner(); // é possível fazer dessa forma também
        inner.printOuterClassAttribute();
        inner2.printOuterClassAttribute();
    }
}
