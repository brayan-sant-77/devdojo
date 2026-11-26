package academy.devdojo.javacore.ZZFthreads.service;

import academy.devdojo.javacore.ZZFthreads.domain.Members;

// vai ser responsável por enviar os emails
public class EmailDeliveryService implements Runnable{
    private final Members members;

    public EmailDeliveryService(Members members) {
        this.members = members;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " starting to deliver emails...");
        // realizamos a verificação para realizar o envio de emails
        while (members.isOpen() || members.pendingEmails() > 0) {
            try {
                String email = members.retrieveEmail();
                if (email.isEmpty()) continue; // vai voltar caso a lista de emails esteja vazia
                System.out.println(threadName + " enviando email para: " + email);
                Thread.sleep(2000);
                System.out.println(threadName + " enviou email com sucesso para: " + email);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Todos os emails foram enviados com sucesso!");

    }
}
