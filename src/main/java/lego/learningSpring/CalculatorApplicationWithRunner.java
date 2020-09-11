package lego.learningSpring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * This class is showing that we can automatically run the calculator and instantiate the necessary
 * components.  The @Bean method of type ApplicationRunner will automatically call its "run" method
 */
@SpringBootApplication
public class CalculatorApplicationWithRunner {
    public static void main(String[] args){
        SpringApplication.run(CalculatorApplicationWithRunner.class, args);

    }

//    @Bean
//    ApplicationRunner calculatorRunner(Calculator calculator){
//        return args -> {
//            calculator.calculate(78, 3, '+');
//            calculator.calculate(4, 8, '*');
//            calculator.calculate(20, 10, '-');
//        };
//    }

    // Now we want this to be more flexible by making the bean method take in parameters from a properties file.
    // The default being src/main/resources/application.properties
    @Bean
    ApplicationRunner calculatorRunner(Calculator calculator,
                                       @Value("${lhs}") int lhs,
                                       @Value("${rhs}") int rhs,
                                       @Value("${op}") char op){
        return args -> calculator.calculate(lhs, rhs, op);
    }

    // By annotating the calculator with the @Component, we don't actually need this constructor
//    @Bean
//    public Calculator calculator(Collection<Operation> operations) {
//        return new Calculator(operations);
//    }
}
