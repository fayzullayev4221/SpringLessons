package src;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RetroMusic implements Music {
    private List<String> musicList = new ArrayList<>();

    {
        musicList.add("Boney-M - Sunny");
        musicList.add("Modern Talking - You are in my Heart");
        musicList.add("Queens - I want to break free");
    }

    @Override
    public List<String> getSong() {
        return musicList;
    }


//    @Override
//    public String getSong() {
//        return  "Boney M  - Sunny";
//    }
}
