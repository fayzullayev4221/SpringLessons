package src;
import java.util.ArrayList;
import java.util.List;


public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();

    public MusicPlayer(List<Music> musicList){
        this.musicList  = musicList ;
    }

    /**
     * @deprecated  dont use this method, use method MusicPlayer instead
     */
    public void playMusic(){
        int randomNumber = (int) (Math.random()*musicList.size());
        System.out.println("Playing : "+musicList.get(randomNumber).getSong());
    }

}


