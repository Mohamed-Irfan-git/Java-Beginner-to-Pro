package basic.thread;

public class Count {
    private int count=0;

    public int getCount(){
        return count;
    }


    public synchronized void increment(){
        int temp=count;

        try {
            Thread.sleep(1);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        count = temp+1;
    }

}
class Team implements Runnable{
    Count count;

    Team(Count count){
        this.count = count;
    }
    @Override
    public void run() {
        for(int i = 0; i < 1000; i++){
            count.increment();
        }
    }
}

class Sync{
    public static void main(String[] args) {
        Count counter = new Count();
        Thread t1 = new Thread(new Team(counter));
        Thread t2 = new Thread(new Team(counter));

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println(counter.getCount());

    }
}