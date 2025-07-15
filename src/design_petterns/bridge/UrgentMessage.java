package design_petterns.bridge;

public class UrgentMessage extends Message {

    public UrgentMessage(MessageSender sender) {
        super(sender);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending  Urgent" + message);

    }
}

class NormalMessage extends Message {
    public NormalMessage(MessageSender sender) {
        super(sender);
    }
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending Normal" + message);
    }
}
