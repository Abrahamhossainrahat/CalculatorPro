import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double firstNumber= in.nextDouble();
        double secondNumber= in.nextDouble();
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(firstNumber,secondNumber));
        System.out.println(calculator.div(firstNumber,secondNumber));
    }
    private double sum(double firstNumber , double secondNumber){
        return firstNumber+secondNumber;
    }
    private double div(double firstNumber, double secondNumber){
        return firstNumber/secondNumber;
    }
}
