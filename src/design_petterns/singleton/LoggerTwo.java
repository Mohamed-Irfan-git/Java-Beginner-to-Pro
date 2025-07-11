package design_petterns.singleton;

public class LoggerTwo {
    public void printSecond(){
        Logger log = Logger.getInstance();
        log.log("I am logger second");
    }
}
