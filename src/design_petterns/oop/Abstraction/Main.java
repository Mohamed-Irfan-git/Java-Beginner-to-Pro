package design_petterns.oop.Abstraction;

public class Main {
    public static void main(String[] args) {
        SendEmail sendEmail = new SendEmail();
        sendEmail.emailReceive();
    }
}
