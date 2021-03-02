package src;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    private List<String> musicList = new ArrayList<>();

    {
        musicList.add("Vivaldi - Seasons of Year (Spring)");
        musicList.add("Chaikovski - Somebody I used to know");
        musicList.add("Shopen - Harmony");
    }

    public void doMyInit() {
        System.out.println("Init Singleton");
    }

    public void doMyDestroy() {
        System.out.println("Destroy Singleton");
    }

    @Override
    public List<String> getSong() {
        return musicList;
    }

//    @Override
//    public String getSong() {
//        return "Vivaldi - Seasons (Spring)";
//    }
}
