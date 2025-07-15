package design_petterns.bridge;

public class EmailSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending Email.." + message);

    }
}
class smsSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS.." + message);

    }
}
