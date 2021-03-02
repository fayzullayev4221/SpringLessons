package src;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("musicPlayer")
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RetroMusic retroMusic;
    private RapMusic rapMusic;
    private MusicType musicType;

    //    private Music music1;
//    private Music music2;
//    private Music music3;
    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RapMusic rapMusic, RetroMusic retroMusic) {
        this.classicalMusic = classicalMusic;
        this.rapMusic = rapMusic;
        this.retroMusic = retroMusic;
    }

//    @Autowired
//    public MusicPlayer (@Qualifier("classicalMusic") Music music1,
//                        @Qualifier("retroMusic") Music music2 ,
//                        @Qualifier("rapMusic") Music music3 ){
//        this.music1 = music1;
//        this.music2 = music2;
//        this.music3 = music3;
//    }
//    @Autowired
//    public MusicPlayer (Music music){
//        this.music = music;
//    }
//    @Autowired
//    public MusicPlayer (ClassicalMusic classicalMusic, RetroMusic retroMusic, RapMusic rapMusic){
//        this.classicalMusic = classicalMusic;
//        this.retroMusic = retroMusic;
//        this.rapMusic = rapMusic;
//    }


    //    public void setVolume(int volume){
//        this.volume = volume;
//    }
    public void playMusic(MusicType musicType) {
        int randomNumber = (int) (Math.random() * 3);
        if (musicType == MusicType.CLASSICAL) {
            System.out.println(classicalMusic.getSong().get(randomNumber));
        }

        if (musicType == MusicType.RAPMUSIC) {
            System.out.println(rapMusic.getSong().get(randomNumber));
        } else if (musicType == MusicType.RETROMUSIC) {
            System.out.println(retroMusic.getSong().get(randomNumber));
        }
    }
//    public void playMusic(){
//        System.out.println("Playing : " + music1.getSong());
//        System.out.println("Playing : " + music2.getSong());
//        System.out.println("Playing : " + music3.getSong());
//    }
}


