package src;

import org.springframework.stereotype.Component;


public class RapMusic implements Music{

    public void doMyInit(){
        System.out.println("Init Prototype");
    }

    public void doMyDestroy(){
        System.out.println("Destroy Prototype");
    }

    @Override
    public String getSong() {
        return "Drake - Wokring on the weekend like usual";
    }
}
