package lego.learningspring;

import java.nio.channels.CancelledKeyException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class UseCalculator {


    public static void main(String[] args) {
        ArrayList<Operation> operationArrayList = new ArrayList<Operation>();
        Multiplication multiplication = new Multiplication();
        Addition addition = new Addition();
        operationArrayList.add(multiplication);
        operationArrayList.add(addition);


        Calculator calculator = new Calculator(operationArrayList);
        calculator.calculate(1, 3, '+');


    }


}
