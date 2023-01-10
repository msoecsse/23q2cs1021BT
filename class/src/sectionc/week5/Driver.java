package sectionc.week5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the age of your favorite pet");
        int age = -1;
        do {
            try {
                age = in.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Shape up.");
                in.nextLine();
            }
        } while(age<0);
        if(age > 18) {
            System.out.println("Woah, that's a lifetime.");
        }
    }
}
