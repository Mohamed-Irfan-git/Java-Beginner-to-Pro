package design_petterns.facade;

public class Main {
    public static void main(String[] args) {
        DVDplayer dvdplayer = new DVDplayer();
        Projector projector = new Projector();
        SoundSystem soundSystem = new SoundSystem();
        HomeTheatorFacade movie = new HomeTheatorFacade(dvdplayer, projector, soundSystem);
        movie.watchMovie(" Sarkar");
        movie.endMovie();
    }
}
