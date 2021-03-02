package src;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("musicPlayer")
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RetroMusic retroMusic;
    private RapMusic rapMusic;
    private MusicType musicType;
    private Music music;

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;


    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing : " + music.getSong());
    }
}


