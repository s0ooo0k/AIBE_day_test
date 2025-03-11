package SolutionTest;

import java.util.logging.Logger;

public class Solution01 {
    public static void main(String[] args) {
        ICalculator calculatr = new Calculator();
        Logger logger = Logger.getLogger("calculator");
        logger.info("%d".formatted(calculatr.add(1, 2)));
        logger.info("%d".formatted(calculatr.subtract(1, 2)));

        // 함수는 익명함수로?
        ICalculatorLambda calculatorLambda = (a, b) -> a*b;
        logger.info("%d".formatted(calculatorLambda.run(5, 12)));

        ICalculatorLambda calculatorLambda1 = calculatr::add;
        logger.info("%d".formatted(calculatorLambda1.run(3, 4)));

        ICalculatorLambda calculatorLambda3 = Calculator::pythagoras;
        logger.info("%d".formatted(calculatorLambda3.run(5, 12)));
    }
}

@FunctionalInterface
interface ICalculatorLambda{
    int run(int a, int b);
}

class Calculator implements ICalculator {

    public static int pythagoras(int a, int b){
        return (int) Math.pow(Math.pow(a, 2) + Math.pow(b, 2), 0.5);
    }
    @Override
    public int add(int a, int b){
        return a+b;
    }

    @Override
    public int subtract(int a, int b) {
        return a-b;
    }
}


interface ICalculator {
    int add(int a, int b);
    int subtract(int a, int b);
}