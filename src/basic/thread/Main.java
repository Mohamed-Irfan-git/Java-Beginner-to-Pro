package basic.thread;

public class Main {
    public static void main(String[] args) {
        Cake cake =new Cake();
        Thread thread1 = new Thread(cake);
        Thread thread2 = new Thread(cake);
        thread1.start();
        thread2.start();
    }
}
