package src;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("springApplicationContextFile.xml");

//       Class A = bean;
//        ClassicalMusic classicalMusic = context.getBean("classicalMusic",ClassicalMusic.class);
//        System.out.println("Playing : "+classicalMusic.getSong());

//       Interface I = bean; -- Inversion of Control (IoC)
//        Music music = context.getBean("popMusic",Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        musicPlayer.playMusic();


//        Dependency Injection (DI)  -- with Constructor --
//        MusicPlayer musicPlayer2 = context.getBean("musicPlayerConst",MusicPlayer.class);
//        musicPlayer2.playMusic();

//        Dependency Injection (DI)  -- with Setter --
//        MusicPlayer musicPlayer3 = context.getBean("musicPlayerSetter",MusicPlayer.class );
//        musicPlayer3.playMusic();


//    ====================================    Init-method , Destroy-method , Factory-method    ======================================

        //try to use with Singleton Bean
//        Music classic1 = context.getBean("init-destroy-singleton",Music.class);
//        Music classic2 = context.getBean("init-destroy-singleton",Music.class);
//        Music classic3 = context.getBean("init-destroy-singleton",Music.class);

        //try to use with Prototype Bean
//        Music street1 = context.getBean("init-destroy-prototype",Music.class);
//        Music street2 = context.getBean("init-destroy-prototype",Music.class);
//        Music street3 = context.getBean("init-destroy-prototype",Music.class);

        // Output :
        //      Init Singleton
        //      Init Prototype
        //      Init Prototype
        //      Init Prototype
        //      Destroy Singleton



        // Factory method
        PopMusic pop3 = context.getBean("factory-method",PopMusic.class);
        System.out.println(pop3.getSong());


        context.close();



    }
}
