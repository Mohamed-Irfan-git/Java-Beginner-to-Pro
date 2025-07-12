package basic.thread;

public class Cake implements Runnable{
    public void run(){
        System.out.println("Cake Mixing " +Thread.currentThread().getId());
        System.out.println("Cake Baking "+Thread.currentThread().getId());
        System.out.println("Cake decoration "+Thread.currentThread().getId());
    }

}
