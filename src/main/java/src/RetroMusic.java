package src;

import org.springframework.stereotype.Component;

@Component
public class RetroMusic implements Music{
    @Override
    public String getSong() {
        return  "Boney M  - Sunny";
    }
}
