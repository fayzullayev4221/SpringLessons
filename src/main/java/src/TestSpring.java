package src;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Computer computer = context.getBean("computer",Computer.class);
        computer.run();

    }
}
