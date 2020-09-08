package lego.learningspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import java.util.Arrays;

/**
 * This just shows all the different annotations that are necessary
 * when creating a spring boor class application
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class DemoApplication {
    public static void main(String[] args) {
        var ctx = SpringApplication.run(DemoApplication.class, args);
        System.out.println("# Beans: " + ctx.getBeanDefinitionCount());
        var names = ctx.getBeanDefinitionNames();
        Arrays.sort(names);
        Arrays.asList(names).forEach(System.out::println);
    }
}
