package src;

import org.springframework.context.annotation.*;

import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan("src")
@PropertySource("classpath:classBeanVariablesExternalFile.properties")
public class SpringConfig {

    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public JazzMusic jazzMusic() {
        return new JazzMusic();
    }

    @Bean
    public RapMusic rapMusic() {
        return new RapMusic();
    }

    //======== new Feature how to use LIST's in applicationContext   ======================
    @Bean
    public List<Music> musicList() {
        return Arrays.asList(classicalMusic(), jazzMusic(), rapMusic());
    }
    //====================================================================================


    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicList());
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }


}
