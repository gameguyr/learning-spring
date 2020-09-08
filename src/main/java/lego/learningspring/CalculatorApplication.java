package lego.learningspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Collection;

@SpringBootApplication
public class CalculatorApplication {
    public static void main(String[] args) {
        var context = SpringApplication.run(CalculatorApplication.class, args);
        var calculator = context.getBean(Calculator.class);

        calculator.calculate(78, 3, '+');
        calculator.calculate(4, 8, '*');
        calculator.calculate(20, 10, '-');
    }
    @Bean
    public Calculator calculator(Collection<Operation> operations) {
        return new Calculator(operations);
    }
}


