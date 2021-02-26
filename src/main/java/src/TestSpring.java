package src;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class TestSpring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("springApplicationContextFile.xml");

//        ==================================       Annotations        =========================================
       String beanId;

        for (int i = 0; i <4 ; i++) {
            System.out.print("Enter beanId you want...");
            beanId=scanner.nextLine();
            Music music = context.getBean(beanId,Music.class);
            MusicPlayer musicPlayer = new MusicPlayer (music);
            musicPlayer.playMusic();
        }


        context.close();




    }
}
