package src;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class TestSpring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springApplicationContextFile.xml");

//        ==================================       Annotations        =========================================
//       String beanId;
//
//        for (int i = 0; i <4 ; i++) {
//            System.out.print("Enter beanId you want...");
//            beanId=scanner.nextLine();
//            Music music = context.getBean(beanId,Music.class);
//            MusicPlayer musicPlayer = new MusicPlayer (music);
//            musicPlayer.playMusic();
//        }


//        ==================================     Inversion of Control with Annotations      ===================
//
//        Music music1 = context.getBean("retroMusic",Music.class);
//        MusicPlayer classicalMusic = new MusicPlayer(music1);
//        classicalMusic.playMusic();
//
//        Music music2  = context.getBean("classicalMusic",Music.class);
//        MusicPlayer classicalMusicPlayer = new MusicPlayer(music2);
//        classicalMusicPlayer.playMusic();
//
//        Music music3 = context.getBean("rapMusic",Music.class);
//        MusicPlayer rockMusicPlayer = new MusicPlayer(music3);
//        rockMusicPlayer.playMusic();

//        ============================      Dependency Injection with Annotations          ====================

//        MusicPlayer onMusicPlayer = context.getBean("playMusicCompositions", MusicPlayer.class);
//        onMusicPlayer.playMusic();


//        ============================              @Qialifier          ========================================


        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic(MusicType.CLASSICAL);
        musicPlayer.playMusic(MusicType.RETROMUSIC);
        musicPlayer.playMusic(MusicType.RAPMUSIC);

        context.close();


    }
}
