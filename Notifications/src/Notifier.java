import java.util.*;

public class Notifier {
    public static void notifierTous(List<Notification> liste, String msg) {
        for (Notification n : liste) {
            n.envoyer(msg);
        }
    }

    public static void main(String[] args) {

        List<Notification> liste = new ArrayList<>();
        liste.add(new EmailNotification());
        liste.add(new SmsNotification());
        liste.add(new PushNotification());


        notifierTous(liste, "Bienvenue dans l'ENAA !");
    }
}