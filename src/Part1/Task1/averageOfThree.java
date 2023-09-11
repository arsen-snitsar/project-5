package Part1.Task1;
import java.util.Scanner;

// Demonstrate use of different arguments of different types, show different count of arguments (0.4).

// Demonstrate decomposition of a task into methods and sub-methods. Show other custom methods call inside your own methods (1):

public class averageOfThree {

    public static Scanner keyboard = new Scanner(System.in);

    public static float askFloat(int whichNumber){
        switch (whichNumber) {
            case 1 -> System.out.println("Please, enter first number:");
            case 2 -> System.out.println("Please, enter second number:");
            case 3 -> System.out.println("Please, enter third number: ");
        }
        return keyboard.nextFloat();
    }

    public static float averageOfThree(float numberOne, float numberTwo, float numberThree){
        return (numberOne + numberTwo + numberThree) / 3;
    }

    public static void main(String[] args) {
        float numberOne, numberTwo, numberThree;
        numberOne = askFloat(1);
        numberTwo = askFloat(2);
        numberThree = askFloat(3);
        System.out.println(averageOfThree(numberOne, numberTwo, numberThree));
    }
}
