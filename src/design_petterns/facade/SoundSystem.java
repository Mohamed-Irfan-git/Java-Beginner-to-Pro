package design_petterns.facade;

public class SoundSystem {
    public void on(){
        System.out.println("DVDplayer is on");
    }
    public void volume(int volume){
        System.out.println("DVDplayer volume is " + volume);
    }
    public void off(){
        System.out.println("DVDplayer is off");
    }
}
