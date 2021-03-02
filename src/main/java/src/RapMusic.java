package src;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RapMusic implements Music {
    private List<String> musicList = new ArrayList<>();

    {
        musicList.add("Drake - Life is good");
        musicList.add("Future - Mask off");
        musicList.add("Drake - Goods plan");
    }

    public void doMyInit() {
        System.out.println("Init Prototype");
    }

    public void doMyDestroy() {
        System.out.println("Destroy Prototype");
    }

    @Override
    public List<String> getSong() {
        return musicList;
    }

//    @Override
//    public String getSong() {
//        return "Drake - Wokring on the weekend like usual";
//    }
}
