package design_petterns.singleton;

public class LoggerThreadSafe {

    //step 1
    private static LoggerThreadSafe instance;

    //step 2
    //prevent from object creating like mew keyword
    private LoggerThreadSafe() {
        System.out.println("LoggerThreadSafe constructor");
    }

    //synchronize keyword make it thread safe
    public static synchronized LoggerThreadSafe getInstance() {
        if (instance == null) {
            instance = new LoggerThreadSafe();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println(message);
    }
}
