package design_petterns.adapter;

public class MediaAdapter implements MediaPlayer {
    private final Mp4Player mp4Player;

    public MediaAdapter() {
        mp4Player = new Mp4Player();
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp4")){
           mp4Player.playerMp4(fileName);
        }
        else{
            System.out.println("Invalid audio type");
        }

    }


}
