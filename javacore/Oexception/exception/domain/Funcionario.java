package academy.devdojo.javacore.Oexception.exception.domain;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa {

   /* - Quando você estende uma classe, não precisamos declarar todas as exceções na classe filha;
- Se for lançar exceções na classe filha, seguem as regras:
    - Declarar 1 ou todas exceções da superclasse;

    - Declarar uma exceção de outro tipo (no exemplo, LoginInvalidoException e FileNotFoundException são do tipo checked
    .Logo, podemos declarar outra e/ou substituir uma delas por uma do tipo unchecked);

    - Declarar outra do tipo unchecked, desde que não seja mais genérica
    (Ex.: Exception é superclasse de LoginInvalidoException, não sendo possível lançá-las juntas).

*/

    @Override
    public void salvar() throws  LoginInvalidoException, FileNotFoundException{
        System.out.println("Salvando Funcionario...");
    }
}
