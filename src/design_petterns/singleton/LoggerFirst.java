package design_petterns.singleton;

public class LoggerFirst {
    public void printFirst() {
        //this method is not thread safety
        //Sometime if try to create instance it will to create both
        Logger log = Logger.getInstance();
        log.log("I am logger first");


        //This is thread safety
        // even same time try to create multiple instance it create only one instance
        LoggerThreadSafe log1= LoggerThreadSafe.getInstance();
        log1.log("I am logger first");
    }
}
