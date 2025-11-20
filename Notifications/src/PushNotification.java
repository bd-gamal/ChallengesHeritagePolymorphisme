public class PushNotification extends Notification {
    @Override
    public void envoyer(String message) {
        System.out.println("Push envoyé : "+ message);
    }
}
