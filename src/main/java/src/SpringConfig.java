package src;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("src")
@PropertySource("classpath:classBeanVariablesExternalFile.properties")
public class SpringConfig {

    @Bean
    public  ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }

    @Bean
    public RetroMusic retroMusic(){
        return new RetroMusic();
    }

    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(classicalMusic(),retroMusic());
    }


}
