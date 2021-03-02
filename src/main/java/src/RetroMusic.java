package src;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RetroMusic implements Music {

    @Override
    public String getSong() {
        return "Queens - I want to break free";
    }

}
