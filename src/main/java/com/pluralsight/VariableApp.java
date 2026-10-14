package com.pluralsight;

public class VariableApp {
    public static void main(String[] args) {
        // Question 1:
        // declare variables here
        // then code solution
        // then use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);

        // Step #1
        String favColor = "Orange";
        int yearClassStarted = 2026;
        char middleInitial = 'M';
        boolean hasPets = false;
        String niceMessage = "Viva la vida!";

        // Step #2
        int daysInTheWeek = 7;
        double coffeePrice = 4.99;
        String favLetter = "R";
        boolean isRaining = true;

        System.out.printf("There are %s in the week.%n", daysInTheWeek);
        System.out.printf("The coffee is priced at: $%.2f%n", coffeePrice);
        System.out.printf("My favorite letter is: %s\n", favLetter);
        System.out.printf("Is it raining? (true/false): %b",isRaining);
    }
}