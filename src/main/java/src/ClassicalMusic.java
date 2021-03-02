package src;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class ClassicalMusic implements Music {
    private List<String> musicList = new ArrayList<>();


    {
        musicList.add("Vivaldi - Seasons of Year (Spring)");
        musicList.add("Chaikovski - Somebody I used to know");
        musicList.add("Shopen - Harmony");
    }


    @PostConstruct
    public void doMyInit(){
        System.out.println("Initialization of Spring");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Destruction of Spring");
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
