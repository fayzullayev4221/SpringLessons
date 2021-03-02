package src;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component

public class ClassicalMusic implements Music {

//    @PostConstruct
//    public void doMyInit() {
//        System.out.println("Initialization of Spring");
//    }
//
//    @PreDestroy
//    public void doMyDestroy() {
//        System.out.println("Destruction of Spring");
//    }

    @Override
    public String getSong() {
        return "Vivaldi - Seasons of Year (Spring)";
    }
}
