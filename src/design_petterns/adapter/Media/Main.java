package design_petterns.adapter.Media;

public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "audio/mpeg");
        audioPlayer.play("mp4", "audio/mp4g");
        audioPlayer.play("wav", "audio/wav");


        MediaAdapter mediaAdapter = new MediaAdapter();
        mediaAdapter.play("mp4", "audio/mpeg");
    }
}
