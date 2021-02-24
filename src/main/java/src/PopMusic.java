package src;

public class PopMusic implements Music{

    private PopMusic(){}

    public static PopMusic getInstance(){
        return new PopMusic();
    }

    public void doMyInit(){
        System.out.println("Init popMusic");
    }

    public void doMyDestroy(){
        System.out.println("Destroy popMusic");
    }

    @Override
    public String getSong() {
        return "The Weekdn - Save your tears";
    }
}
