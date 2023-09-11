package Part1;
import java.util.Scanner;

// Demonstrate use of methods without return value (0.2).

public class Demo2Void {

    public static Scanner keyboard = new Scanner(System.in);

    public static void printEuropeanFormat(byte day, byte month, int year){
        System.out.printf("%02d.%02d.%04d\n", day, month, year);
    }

    public static void printAmericanFormat(byte month, byte day, int year){
        System.out.printf("%02d/%02d/%04d\n", month, day, year);
    }

    public static byte inputByte(String question){
        System.out.println(question);
        return keyboard.nextByte();
    }

    public static void main(String[] args) {
        System.out.print("Welcome! This is a date format program. ");

        byte day = inputByte("Please, enter day of the month:");
        byte month = inputByte("And month?");

        System.out.println("Year?");
        int year = keyboard.nextInt();

        printAmericanFormat(day, month, year);
        printEuropeanFormat(month, day, year);
    }
}
