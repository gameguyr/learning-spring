package lego.learningspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * This shows how all the annotation of the previous DemoApplication are now
 * reduced to just using the @SpringBootApplication
 */
@SpringBootApplication
public class LearningSpringApplication {

    public static void main(String[] args) {

        SpringApplication.run(LearningSpringApplication.class, args);
    }

}
