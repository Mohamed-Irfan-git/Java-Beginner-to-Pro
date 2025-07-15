package design_petterns.facade;

public class Projector {
    public void on() {
        System.out.println("DVDplayer is on");
    }
    public void setup(DVDplayer dvDplayer){
        System.out.println("DVDplayer is setup");
    }
    public void off() {
        System.out.println("DVDplayer is off");
    }
}
