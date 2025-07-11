package design_petterns.singleton;

public class Main {
    public static void main(String[] args) {
        LoggerFirst loggerFirst = new LoggerFirst();
        loggerFirst.printFirst();

        LoggerTwo loggerTwo = new LoggerTwo();
        loggerTwo.printSecond();


    }
}
