package Part1.Task1;
import java.util.Scanner;

// Demonstrate use of different arguments of different types, show different count of arguments (0.4).

public class Demo1 {

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

    public static byte askMonth(){
        System.out.println("Enter month (1-12): ");
        return keyboard.nextByte();
    }

    public static float averageOfThree(float numberOne, float numberTwo, float numberThree){
        return (numberOne + numberTwo + numberThree) / 3;
    }

    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(getMonth(askMonth()));

    }
}
