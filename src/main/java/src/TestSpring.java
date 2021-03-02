package src;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class TestSpring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springApplicationContextFile.xml");

//        ==========================    @Scope    @Valid   @PreDestroy   @PostConstruct        =========================

        /*MusicPlayer classicalMusicPlayer1 = context.getBean("musicPlayer",MusicPlayer.class);
        MusicPlayer classicalMusicPlayer2 = context.getBean("musicPlayer",MusicPlayer.class);
        System.out.println(classicalMusicPlayer1.getName());
        System.out.println(classicalMusicPlayer1.getVolume());

        System.out.println(classicalMusicPlayer1);
        System.out.println(classicalMusicPlayer2);*/

        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic",ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("classicalMusic",ClassicalMusic.class);

        System.out.println(classicalMusic1);
        System.out.println(classicalMusic2);

        context.close();


    }
}
