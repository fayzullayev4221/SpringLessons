package src;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{

    public void doMyInit(){
        System.out.println("Init Singleton");
    }

    public void doMyDestroy(){
        System.out.println("Destroy Singleton");
    }

    @Override
    public String getSong() {
        return "Vivaldi - Seasons (Spring)";
    }
}
