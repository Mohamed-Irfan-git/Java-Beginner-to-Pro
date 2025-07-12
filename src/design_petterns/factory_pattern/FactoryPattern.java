package design_petterns.factory_pattern;

public class FactoryPattern {
    public Message getMessage(String message) {
        if(message==null){
            return null;
        }
        if(message.equalsIgnoreCase("Email")){
            return new Email();
        }
        else if(message.equalsIgnoreCase("Phone")){
            return new  Push();
        }
        else if(message.equalsIgnoreCase("Message")){
            return new SMS();
        }
        return null;

    }
}
