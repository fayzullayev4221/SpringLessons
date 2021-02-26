package src;

import org.springframework.stereotype.Component;

@Component("retroMusic")
public class RetroMusic implements Music{
    @Override
    public String getSong() {
        return  "Thomas Andreas - You are in my Heart";
    }
}
