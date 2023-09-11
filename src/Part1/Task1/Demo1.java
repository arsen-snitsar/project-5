package Part1.Task1;
import java.util.Scanner;

// Demonstrate use of different arguments of different types, show different count of arguments (0.4).

public class Demo1 {

    public static byte askMonth(){
        System.out.println("Enter month (1-12): ");
        return keyboard.nextByte();
    }

    public static String getMonth(byte month){
        switch (month) {
            case 1 -> {
                return "January";
            }
            case 2 -> {
                return "February";
            }
            case 3 -> {
                return "March";
            }
            case 4 -> {
                return "April";
            }
            case 5 -> {
                return "May";
            }
            case 6 -> {
                return "June";
            }
            case 7 -> {
                return "July";
            }
            case 8 -> {
                return "August";
            }
            case 9 -> {
                return "September";
            }
            case 10 -> {
                return "October";
            }
            case 11 -> {
                return "November";
            }
            case 12 -> {
                return "December";
            }
            default -> {
                return "Invalid month";
            }
        }
    }

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

    public static boolean askBoolean(int whichBoolean){
        switch (whichBoolean) {
            case 1 -> System.out.println("Please, enter first boolean:");
            case 2 -> System.out.println("Please, enter second boolean: ");
        }
        return keyboard.nextBoolean();
    }

    public static boolean doAnd(boolean firstBoolean, boolean secondBoolean){
        if (firstBoolean && secondBoolean)
            return true;
        return false;
    }

    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        //System.out.println(getMonth(askMonth()));

        /*float numberOne, numberTwo, numberThree;
        numberOne = askFloat(1);
        numberTwo = askFloat(2);
        numberThree = askFloat(3);
        System.out.println(averageOfThree(numberOne, numberTwo, numberThree));*/

        boolean firstBoolean, secondBoolean;
        firstBoolean = askBoolean(1);
        secondBoolean = askBoolean(2);
        System.out.println(doAnd(firstBoolean, secondBoolean));
    }
}
