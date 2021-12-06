package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
         * Practice problems.  Problems can have multiple correct implementations,
         * and can be solved in multiple ways.
         * functions can be used on all problems, if so desired.
         *
         */
        System.out.println("Welcome!");
        menu();
    }

    public static void printNumberFunction(boolean printAll, boolean printEven) {
        for (int i = 1; i <= 100; i++) {
            //print all numbers between 1 - 100
            if (printAll) {
                System.out.println(i + " ");
                //print only even numbers between 1 - 100
            } else if (printEven) {
                if (i % 2 == 0) {
                    System.out.println(i + " ");
                }
                //print all odd numbers between 1 - 100
            } else {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }
    }

    /*
     * Create functions named "A", "B", "C", "D", and "E"
     * "A","B","C","D" should take in two Integer variables(parameters) and return an integer
     * "A" should return the sum of the two parameters
     * "B" should return the difference of the two parameters
     * "C" should return the product of the two parameters
     * "D" should return the quotient of the two parameters
     * "E" should have one integer parameter, and not return anything
     * "E" should print out the parameter along with a useful message
     *
     * Demo that you built functions A,B,C,D,E correctly by calling them in the main method with different inputs
     *
     */

    public static int A(int numOne, int numTwo) {
        return numOne + numTwo;
    }

    public static int B(int numOne, int numTwo) {
        return numOne - numTwo;
    }

    public static int C(int numOne, int numTwo) {
        return numOne * numTwo;
    }

    public static int D(int numOne, int numTwo) {
        return numOne / numTwo;
    }

    public static void E(int num) {
        System.out.println("The answer is : " + num);
    }

    /*
     * Create a function called fizzBuzz which takes in one Integer parameter and does not return anything
     *
     * Console out a welcome message to the user and tell them the rules of fizzBuzz.
     * Ask the user to pick a maximum number
     *
     *
     *                  -------FIZZBUZZ RULES-------
     * "Write a program that prints the numbers from 1 to user input
     *  But for multiples of three print “Fizz” instead of the number
     *  and for the multiples of five print “Buzz”.
     * For numbers which are multiples of both three and five print “FizzBuzz”."
     *
     *
     * Call the fizzbuzz function with some different input to check if it is working.
     *
     */

    public static void fizzBuzzRules() {
        System.out.println("prints the numbers from 1 to user input.");
        System.out.println("But for multiples of three print “Fizz” instead of the number.");
        System.out.println("and for the multiples of five print “Buzz”.");
        System.out.println("For numbers which are multiples of both three and five print “FizzBuzz”.");
        System.out.println("");
        System.out.println("*********************");
        System.out.println("");
        menu();
    }

    public static void fizzBuzz(int start, int end, int fizzNumber, int buzzNumber) {
        for(int i = start; i < end; i++) {
            if(i % fizzNumber == 0 && i % buzzNumber == 0) {
                System.out.println("FizzBuzz");
            }
            else if(i % fizzNumber == 0) {
                System.out.println("Fizz");
            }
            else if(i % buzzNumber == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }

    /*
     *                  --------Challenge ---------
     * Create a menu which allows a user to pick which one of the function created above they would like to select
     *
     */

    public static void menuOptions() {
        System.out.println("Please press 1 to print all numbers between 1 - 100");
        System.out.println("Please press 2 to print only even numbers between 1 - 100");
        System.out.println("Please press 3 to print only odd numbers between 1 - 100");
        System.out.println("Please press 4 to add two numbers");
        System.out.println("Please press 5 to subtract two numbers");
        System.out.println("Please press 6 to multiply two numbers");
        System.out.println("Please press 7 to divide two numbers");
        System.out.println("Please press 8 to see the fizzBuzz rules");
        System.out.println("Please press 9 to play fizzbuzz");
        System.out.println("");

    }

    //menu using a switch statement
    public static void menuAsSwitch() {

        menuOptions();
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();

        switch (userInput) {
            case "1" -> printNumberFunction(true, false);
            case "2" -> printNumberFunction(false, true);
            case "3" -> printNumberFunction(false, false);
            case "4" -> System.out.println("Please pick two numbers to add " + A(scanner.nextInt(), scanner.nextInt()));
            case "5" -> System.out.println("Please pick two numbers to subtract " + B(scanner.nextInt(), scanner.nextInt()));
            case "6" -> System.out.println("Please pick two numbers to multiply " + C(scanner.nextInt(), scanner.nextInt()));
            case "7" -> System.out.println("Please pick two numbers to divide " + D(scanner.nextInt(), scanner.nextInt()));
            case "8" -> fizzBuzzRules();
            case "9" -> {
                int start;
                int end;
                int fuzzNumber;
                int buzzNumber;
                System.out.println("Please enter the starting number for the fizzBuzz game");
                start = scanner.nextInt();
                System.out.println("Please enter the ending number for the fizzBuzz game");
                end = scanner.nextInt();
                System.out.println("Please enter the fizz number for the fizzBuzz game");
                fuzzNumber = scanner.nextInt();
                System.out.println("Please enter the buzz number for the fizzBuzz game");
                buzzNumber = scanner.nextInt();
                fizzBuzz(start, end, fuzzNumber, buzzNumber);
            }
        }
    }

    //same code using if statements
    public static void menu() {

        menuOptions();
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();

        if(userInput.equals("1")) printNumberFunction(true,false);
        else if(userInput.equals("2")) printNumberFunction(false, true );
        else if(userInput.equals("3")) printNumberFunction(false, false);
        else if(userInput.equals("4")) System.out.println("Please pick two numbers to add " + A(scanner.nextInt(), scanner.nextInt()));
        else if(userInput.equals("5")) System.out.println("Please pick two numbers to subtract " + B(scanner.nextInt(), scanner.nextInt()));
        else if(userInput.equals("6")) System.out.println("Please pick two numbers to multiply " + C(scanner.nextInt(), scanner.nextInt()));
        else if(userInput.equals("7")) System.out.println("Please pick two numbers to divide " + D(scanner.nextInt(), scanner.nextInt()));
        else if(userInput.equals("8")) fizzBuzzRules();
        else if(userInput.equals("9")) {
            int start;
            int end;
            int fuzzNumber;
            int buzzNumber;
            System.out.println("Please enter the starting number for the fizzBuzz game");
            start = scanner.nextInt();
            System.out.println("Please enter the ending number for the fizzBuzz game");
            end = scanner.nextInt();
            System.out.println("Please enter the fizz number for the fizzBuzz game");
            fuzzNumber = scanner.nextInt();
            System.out.println("Please enter the buzz number for the fizzBuzz game");
            buzzNumber = scanner.nextInt();
            fizzBuzz(start,end,fuzzNumber,buzzNumber);

        }

        else {
            System.out.println("Sorry, please choose one of the following options: ");
            menu();
        }
    }
}
