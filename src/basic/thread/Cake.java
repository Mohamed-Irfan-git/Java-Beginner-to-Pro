package basic.thread;

public class Cake implements Runnable{


    @Override
    public void run() {

//        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(5000);
                System.out.println(Thread.currentThread().getName()+":"+i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
