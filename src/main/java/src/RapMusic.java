package src;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//@Component
public class RapMusic implements Music {


    public void doMyInit() {
        System.out.println("Init Prototype");
    }

    public void doMyDestroy() {
        System.out.println("Destroy Prototype");
    }

    @Override
    public String getSong() {
        return "Drake - Working on the weekends like USUAL";
    }

}
