package basic.thread;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) {
            Cake cake = new Cake();
            Thread thread = new Thread(cake);
            thread.start();

        }
    }
}
