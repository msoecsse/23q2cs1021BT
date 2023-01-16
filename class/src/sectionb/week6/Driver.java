package sectionb.week6;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
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

    public static void main2(String[] args) {
        try {
            Object blah = "bad stuff";
            blah = null;
            blah.toString();
            System.out.println("Maybe run");
            Scanner in = (Scanner) blah;
            System.out.println("Never run");
        } catch(NullPointerException e) {
            System.out.println("You should not catch null pointer exceptions");
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
