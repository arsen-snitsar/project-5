package Part1.Task1;

import java.util.Scanner;

public class booleanReturn {

    public static Scanner keyboard = new Scanner(System.in);

    public static boolean askBoolean(int whichBoolean){
        switch (whichBoolean) {
            case 1 -> System.out.println("Please, enter first boolean:");
            case 2 -> System.out.println("Please, enter second boolean: ");
        }
        return keyboard.nextBoolean();
    }

    public static boolean doAnd(boolean firstBoolean, boolean secondBoolean){
        return firstBoolean && secondBoolean;
    }

    public static void main(String[] args) {
        boolean firstBoolean, secondBoolean;
        firstBoolean = askBoolean(1);
        secondBoolean = askBoolean(2);
        System.out.println(doAnd(firstBoolean, secondBoolean));
    }

}
