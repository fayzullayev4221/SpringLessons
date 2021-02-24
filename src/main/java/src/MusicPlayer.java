package src;

public class MusicPlayer {
    private Music music;
    private int volume;


    public MusicPlayer (Music music){
        this.music = music;
    }

    public MusicPlayer (){}

    public void setMusic(Music music){
        this.music = music;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }

    public void playMusic(){
        System.out.println("Playing : "+music.getSong());
    }
}
