package lego.learningspring;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * This class's purpose is to show me how the @component annotation, when  applied to a class
 * will make it so that is will automatically be picked up and instantiated.
 */

@Component
public class HelloWorld {
    @PostConstruct
    public void sayHello() {
        System.out.println("Hello World, from Spring Boot 2!");
    }

}
