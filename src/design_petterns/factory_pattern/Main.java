package design_petterns.factory_pattern;

public class Main {
    public static void main(String[] args) {
        FactoryPattern factory = new FactoryPattern();

        Message msg = factory.getMessage("Message");
        msg.notifyUser();

    }
}
