package academy.devdojo.javacore.ZZFthreads.test;

import academy.devdojo.javacore.ZZFthreads.domain.Members;
import academy.devdojo.javacore.ZZFthreads.service.EmailDeliveryService;

import javax.swing.*;

public class EmailDeliveryTest01 {
    public static void main(String[] args) {
        Members members = new Members();
        Thread yamamoto = new Thread(new EmailDeliveryService(members), "Yamamoto");
        Thread ukitake = new Thread(new EmailDeliveryService(members), "Ukitake");

        yamamoto.start();
        ukitake.start();
        while (true) {
            String seuEmail = JOptionPane.showInputDialog("Entre com seu email: ");
            // caso o email esteja vazio, nos paramos o programa
            if (seuEmail == null || seuEmail.isEmpty()) {
                members.close();
                break;
            }
            // adicionamos o email
            members.addMemberEmail(seuEmail);
        }
    }
}
