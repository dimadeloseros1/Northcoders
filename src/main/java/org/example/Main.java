package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String name = "Dima";
        int birthYear = 1992;
        double weight = 73.5;
        double pi = 3.14159;

        System.out.println(name);
        System.out.println(birthYear);
        System.out.println(pi);


        // Booleans

        boolean isLearningJava = true;

        System.out.println(isLearningJava);

        // Reassigning Variables

        String favouriteFilm = "Star Wars";
        System.out.println("My favorite film is: " + favouriteFilm);
        favouriteFilm = "Hulk Smash!";
        System.out.println("My favourite film is " + favouriteFilm);

        String firstName = "Dmytro";
        printGreeting(firstName);
        System.out.println(subtractingMethod(21, 5));

        boolean firstTest = isStringLonger("James", 4);
        boolean secondTest = isStringLonger("Juan", 6);
        System.out.println(firstTest);
        System.out.println(secondTest);
    }

    private static void printGreeting(String name) {
        System.out.println("Hello " + name);
    }

    private static int subtractingMethod (int first, int second) {
        return first - second;
    }

    private static boolean isStringLonger(String word, int num) {
        if (word.length() > num) {
            return true;
        }
        return false;
    }
}