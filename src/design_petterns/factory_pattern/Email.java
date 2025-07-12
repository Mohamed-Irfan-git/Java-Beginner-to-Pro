package design_petterns.factory_pattern;

public class Email implements Message {
    @Override
    public void notifyUser() {
        System.out.println("Email has been notified");
    }
}
