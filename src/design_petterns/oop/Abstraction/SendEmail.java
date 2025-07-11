package design_petterns.oop.Abstraction;

public class SendEmail {
    public void emailReceive(){
        disconnect();
        upload();
        message();

    }

    private void disconnect(){
        System.out.println("Connection closed");
    }
    private void upload(){
        System.out.println("Uploading");
    }

    private void message(){
        System.out.println("Message sent");
    }
}
