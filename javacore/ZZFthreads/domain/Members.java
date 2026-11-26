package academy.devdojo.javacore.ZZFthreads.domain;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

// essa classe vai ser responsável por ter a lista de emails
public class Members {
    // como o email vai ser sempre na ordem, utilizamos um Queue
    private final Queue<String> emails = new ArrayBlockingQueue<>(10); // definimos a capacidade
    // usamos esse boolean como uma "chave" para abrir e fechar a classe quando for preciso receber emails
    private boolean open = true;

    // retornar se está aberto
    public boolean isOpen() {
        return open;
    }

    // esse método vai retornar o size, se nós ainda temos algum email a ser enviado
    public int pendingEmails() {
        synchronized (emails) { // duas threads não vão poder acessar esse email ao mesmo tempo
            return emails.size();
        }
    }

    // método responsável por adicionar um email
    public void addMemberEmail(String email) {
        synchronized (this.emails){
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " Adicionou email na lista");
            this.emails.add(email);
            // vamos avisar todas as threads que temos um email em espera
            this.emails.notifyAll();
        }
    }

    // esse método vai pegar os emails
    public String retrieveEmail() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " checking if there emails");
        synchronized (emails) {
            // se por acaso não houver emails, nós queremos que as threads fiquem aguardando
            while (this.emails.isEmpty()) {
                if (!open) return null;
                System.out.println(Thread.currentThread().getName() + " Não tem email disponível na lista, entrando em modo de espera");
                // quando chamamos o wait, nós precisamos tratar a exceção InterruptedException
                // só podemos chamar o wait() quando nós tivermos o lock do objeto
                // nesse caso, todas as vezes que formos chamar o wait, nós precisamos estar dentro de um bloco sincronizado
                this.emails.wait(); // a thread vai ficar em modo de espera
            }
            // retornamos o primeiro email e remove
            return this.emails.poll();
        }

    }

    public void close() {
        open = false;
        // quando formos chamar o notifyAll(), nós precisamos estar num contexto sincronizado
        synchronized (this.emails) {
            System.out.println(Thread.currentThread().getName() + " Notificando todo mundo que não estamos mais pegando emails");

        }
    }
}
