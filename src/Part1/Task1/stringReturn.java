package Part1.Task1;

// Demonstrate use of different types for return values. Show returned value handling in outer program (0.4).

import java.util.Scanner;

public class stringReturn {

    public static Scanner keyboard = new Scanner(System.in);

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

    public static void main(String[] args) {
        System.out.println(getMonth(askMonth()));
    }
}
