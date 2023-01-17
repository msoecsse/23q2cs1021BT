package sectiona.week6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        try {
            call1();
        } catch (ArithmeticException e) {
            System.out.println("You almost made it to the JVM");
        }
        Scanner in = new Scanner(System.in);
        in.nextInt();
        int weight = -1;
        do {
            try {
                System.out.println("Please enter your weight in lbs");
                weight = in.nextInt();
                System.out.println("Thank you for entering an integer value");
            } catch(InputMismatchException exception) {
                in.nextLine();
                System.out.print("To the nearest integer value... ");
            }
        } while(weight<0);
    }

    private static double call1() {
        try {
            call2();
        } catch(NumberFormatException e) {
            System.out.println("Gotcha NFE");
        }
        return 0;
    }

    private static double call2() {
        try {
            call3();
        } catch(InputMismatchException e) {
            System.out.println("Gotcha IME");
        }
        return 0;
    }

    private static double call3() {
        if(3>Math.random()) {
            throw new ArithmeticException("no very mathematical");
        }
        return 0;
    }

    public static void main2(String[] args) {
        System.out.println("What is the age of your favorite pet? (enter \"none\" if you don't have a favorite pet)");
        Scanner in = new Scanner(System.in);
        try {
            int age = in.nextInt();
            boolean isOld = age >= 9;
            System.out.println("Your pet is " + (isOld ? "" : "not ") + "old.");
        } catch(InputMismatchException e) {
            in.next();
            System.out.println("You must be lonely.");
        }
        try {
            int age = in.nextInt();
            boolean isOld = age >= 9;
            System.out.println("Your pet is " + (isOld ? "" : "not ") + "old.");
        } catch(InputMismatchException e) {
            System.out.println("You must be lonely.");
        }
        System.out.println("Thank you for running this dumb program.");
    }
}
