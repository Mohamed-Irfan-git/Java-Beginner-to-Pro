package design_petterns.factory_pattern;

public class Push implements Message{
    @Override
    public void notifyUser() {
        System.out.println("Push Notification has been notified");    }
}
