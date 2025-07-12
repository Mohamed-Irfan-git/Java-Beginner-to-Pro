package design_petterns.factory_pattern;

public class SMS implements Message {
    @Override
    public void notifyUser() {
        System.out.println("SMS has been notified");
    }
}
