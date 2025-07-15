package design_petterns.adapter.Media;

public class AudioPlayer implements MediaPlayer {
    private final MediaAdapter mediaAdapter;
    public AudioPlayer() {
        mediaAdapter = new MediaAdapter();
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equals("mp3")){
            System.out.println("Playing mp3 file: " + fileName);
        }
        else if(audioType.equals("mp4")){
            mediaAdapter.play(audioType, fileName);
        }
        else{
            System.out.println("Invalid audio type: " + audioType);
        }

    }
}
