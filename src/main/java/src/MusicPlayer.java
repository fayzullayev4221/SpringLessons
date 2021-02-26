package src;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private Music music;
    private RetroMusic retroMusic;
    private ClassicalMusic classicalMusic;
    private int volume;


//    @Autowired
//    public MusicPlayer (RetroMusic retroMusic){
//        this.retroMusic  = retroMusic;
//    }
//    @Autowired
//    public MusicPlayer (Music music){
//        this.music = music;
//    }
    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic , RetroMusic retroMusic ){
        this.classicalMusic = classicalMusic;
        this.retroMusic = retroMusic;
    }
    public MusicPlayer (){}


//
//    @Autowired
//    public void setMusic(Music music){
//        this.music = music;
//    }

    public void setVolume(int volume){
        this.volume = volume;
    }

    public String playMusic(){
        return "Playing : "+classicalMusic.getSong()+"\n"+
        "Playing : "+retroMusic.getSong();
    }
}
