package src;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("springApplicationContextFile.xml");

//       Class A = bean;
        ClassicalMusic classicalMusic = context.getBean("classicalMusic",ClassicalMusic.class);
        System.out.println("Playing : "+classicalMusic.getSong());

//       Interface I = bean; -- Inversion of Control (IoC)
        Music music = context.getBean("popMusic",Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();


//        Dependency Injection (DI)  -- with Constructor --
        MusicPlayer musicPlayer2 = context.getBean("musicPlayerConst",MusicPlayer.class);
        musicPlayer2.playMusic();

//        Dependency Injection (DI)  -- with Setter --
        MusicPlayer musicPlayer3 = context.getBean("musicPlayerSetter",MusicPlayer.class );
        musicPlayer3.playMusic();




    }
}
