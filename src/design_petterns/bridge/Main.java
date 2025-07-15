package design_petterns.bridge;

public class Main {
    public static void main(String[] args) {
        MessageSender email = new EmailSender();
//        MessageSender sms = new smsSender();
//
//        Message msg = new UrgentMessage(email);
//        msg.sendMessage(" Server is down");

        email.sendMessage("Hello World!");


    }
}
