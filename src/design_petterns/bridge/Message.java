package design_petterns.bridge;
public abstract class Message {
     private  MessageSender sender;

     public Message(MessageSender sender) {
         this.sender = sender;
     }

     public abstract void sendMessage(String message);

}
