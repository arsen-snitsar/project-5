/*
input(name)
input(age)
input(genre)
input(money)
while continue == "y"
    switch genre
        case "adventure":
            if age > 12
                if money > 220
                    output(Treasure Island)
                    askIfContinue
                else
                    output(No Books)
                    askIfContinue
            else
                if money > 249
                    output(Dog Patron)
                    askIfContinue
                else
                    output(Alice in the Wonderland)
                    askIfContinue
        case "science fiction":
            if age > 13
                if money > 440
                    output(Dune)
                    askIfContinue
                else
                    output(Foundation)
                    askIfContinue
            else
                if money > 199
                    output(20,000 leauges under water)
                    askIfContinue
                else
                    output(No Books)
                    askIfContinue
 */


package Part2;

import java.util.Scanner;

public class Part2 {

    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        String shouldContinue = "Y";
        boolean isFirstIteration = true;

        String name = askName();

        do {

            byte age = askAge(isFirstIteration, name);
            String genre = askGenre();
            long money = askMoney();

            // choosing a book based on inputs
            System.out.println("Well done. The program will soon find a best-fitting book for you.");
            switch (genre){
                case "adventure":
                    if (age > 12){
                        if (money >= 220)
                            shouldContinue = getRecommendation("Treasure Island",
                                    "https://nashformat.ua/products/ostriv-skarbiv-urbino-914515");
                        else
                            shouldContinue = alertNoBooks();
                    }
                    else{
                        if (money >= 249)
                            shouldContinue = getRecommendation("Dog Patron and Socks' Monster",
                                    "https://book-ye.com.ua/catalog/komiksy-dlya-ditej-i-pidlitkiv/pes-patron-ta-shkarpetkovyj-monstr-knyha-1/");
                        else
                            shouldContinue = getRecommendation("Alice's Adventures in the Wonderland",
                                    "https://book-ye.com.ua/catalog/dytyacha-proza/alisa-v-krayini-dyv-shkilna-seriya/");
                    }
                    isFirstIteration = false;
                    break;
                case "science fiction":
                    if (age > 13){
                        if (money >= 440)
                            shouldContinue = getRecommendation("Dune", "https://bookclub.ua/catalog/books/fantastic_books/dyuna");
                        else
                            shouldContinue = getRecommendation("Foundation", "https://bookclub.ua/catalog/books/fantastic_books/fundaciya-kniga-1");
                    }
                    else {
                        if (money >= 199)
                            shouldContinue = getRecommendation("20,000 Leauges Under Water", "https://book-ye.com.ua/catalog/pryhodnytska-literatura/20000-lye-pid-vodoyu-svitovyd/");
                        else
                            shouldContinue = alertNoBooks();
                    }
                    isFirstIteration = false;
                    break;
                default:
                    shouldContinue = alertNoBooks();
                    isFirstIteration = false;
            }
        }while (shouldContinue.equals("Y") || shouldContinue.equals("y"));
    }
    public static String getRecommendation (String suitableBook, String link){
        System.out.println("The most suitable book for you is \"" + suitableBook + "\".\n" +
                "You can buy the book here - " + link + "\n" +
                "If you are unsatisfied with the result or want to look for a few more books, "  +
                "feel free to continue! (Y/N)");
        return keyboard.nextLine();
    }
    public static String alertNoBooks (){
        System.out.println("Sorry, we could not find any books for you.\nHowever, you can try changing one of your " +
                "input parameters and maybe you will find something else! Continue? (Y/N)");
        return keyboard.nextLine();
    }

    public static long askMoney(){
        System.out.println("And how much money do you wish to spend on a book?");
        long money = keyboard.nextLong();
        keyboard.nextLine();
        return money;
    }

    public static String askGenre(){
        System.out.println("Great! And book of which genre would you like to read?" +
                "\n(unfortunately, adventure/science fiction are the only ones available right now)");
        return keyboard.nextLine();
    }

    public static String askName(){
        System.out.println("Hi! This is a book recommendation program. What is your name?");
        return keyboard.nextLine();
    }

    public static byte askAge(boolean isFirstIteration, String name){
        if (isFirstIteration)
            System.out.println("Nice to meet you, " + name + ".\nCould you please tell me your age?");
        else
            System.out.println("Nice to meet you again, " + name + ".\nCould you remind me your age, please?");
        byte age = keyboard.nextByte();
        keyboard.nextLine();
        return age;
    }
}
