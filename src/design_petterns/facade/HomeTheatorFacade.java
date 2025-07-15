package design_petterns.facade;

public class HomeTheatorFacade {
    private final DVDplayer dvdplayer;
    private final Projector projector;
    private final SoundSystem soundSystem;

    public HomeTheatorFacade(DVDplayer dvdplayer, Projector projector, SoundSystem soundSystem) {
        this.dvdplayer = dvdplayer;
        this.projector = projector;
        this.soundSystem = soundSystem;
    }

    public void watchMovie(String movie) {
        System.out.println("Get Ready to watch....");
        projector.on();
        projector.setup(dvdplayer);
        soundSystem.on();
        soundSystem.volume(10);
        dvdplayer.on();
        dvdplayer.play(movie);

    }

    public void endMovie() {
        System.out.println("Sutting Out of movie....");
        dvdplayer.off();
        soundSystem.off();
        projector.off();

    }
}
