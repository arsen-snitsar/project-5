import java.util.Scanner;

public class Part3 {

    // Calculator

    public static Scanner keyboard = new Scanner(System.in);

    public static double add(double firstNumber, double secondNumber){
        return firstNumber + secondNumber;
    }

    public static double substract(double firstNumber, double secondNumber){
        return firstNumber - secondNumber;
    }

    public static double multiplicate(double firstNumber, double secondNumber){
        return firstNumber * secondNumber;
    }

    public static double divide(double firstNumber, double secondNumber){
        return firstNumber / secondNumber;
    }

    public static double enterNumber(boolean isFirstNumber){
        if (isFirstNumber)
            System.out.print("Please, enter the first number: ");
        else
            System.out.print("Please, enter the second number: ");
        double enteredNumber = keyboard.nextDouble();
        keyboard.nextLine();
        return enteredNumber;
    }

    public static String enterOperator(){
        System.out.print("Please, enter the operator: ");
        return keyboard.nextLine();
    }

    public static double result(double firstOperand, String operator, double secondOperand){
        switch (operator) {
            case "+" -> {
                return add(firstOperand, secondOperand);
            }
            case "-" -> {
                return substract(firstOperand, secondOperand);
            }
            case "*" -> {
                return multiplicate(firstOperand, secondOperand);
            }
            case "/" -> {
                return divide(firstOperand, secondOperand);
            }
            default -> {
                return -1;
            }
        }
    }

    public static boolean askIfContinue(){
        System.out.println("\nContinue? (y/n)");
        String shouldContinue = keyboard.nextLine();
        return shouldContinue.equals("Y") || shouldContinue.equals("y");
    }

    public static void main(String[] args) {

        double firstOperand, secondOperand;
        String operator, shouldContinue;

        do {
            firstOperand = enterNumber(true);
            operator = enterOperator();
            secondOperand = enterNumber(false);

            System.out.printf("%.2f", result(firstOperand, operator, secondOperand));
        }while (askIfContinue());

    }
}
