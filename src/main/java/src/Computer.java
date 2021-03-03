package src;

import org.springframework.beans.factory.annotation.Autowired;


public class Computer   {
    private MusicPlayer musicPlayer;

    public Computer(MusicPlayer musicPlayer){
        this.musicPlayer = musicPlayer;
    }


    public void run(){
        musicPlayer.playMusic();
    }
}
