package src;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("playAllMusicCompositions")
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RetroMusic retroMusic;
    private RapMusic rapMusic;
    private Music music ;


//    @Autowired
//    public MusicPlayer (Music music){
//        this.music = music;
//    }
    @Autowired
    public MusicPlayer (ClassicalMusic classicalMusic, RetroMusic retroMusic, RapMusic rapMusic){
        this.classicalMusic = classicalMusic;
        this.retroMusic = retroMusic;
        this.rapMusic = rapMusic;
    }


//    public void setVolume(int volume){
//        this.volume = volume;
//    }

    public void playMusic(){
        System.out.println("Playing : " + classicalMusic.getSong());
        System.out.println("Playing : " + retroMusic.getSong());
        System.out.println("Playing : " + rapMusic.getSong());
    }
}
