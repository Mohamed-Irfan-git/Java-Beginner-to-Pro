package design_petterns.facade;

public class DVDplayer {
    public void on(){
        System.out.println("DVDplayer is on");
    };
    public void play(String name){
        System.out.println("DVDplayer is playing" + name);
    }
    public void off() {
        System.out.println("DVDplayer is off");
    }
}
