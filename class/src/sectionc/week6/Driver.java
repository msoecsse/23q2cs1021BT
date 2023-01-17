package sectionc.week6;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner("This is a number: 8");
            System.out.println(in.next());
            System.out.println(in.next());
            System.out.println(in.next());
            System.out.println(in.nextInt());
            System.out.println(in.nextInt());
            System.out.println(in.next());
            System.out.println(in.next());
        } catch(InputMismatchException | IllegalAccessError e) {
            System.out.println("I'm not a number... said the token");
        } catch(NoSuchElementException e) {
            System.out.println("I'm exhausted... said the scanner");
        }
        try {
            methodB();
        } catch (IOException e) {
            System.out.println("We have no business calling methodB.");
        }
    }

    private static void methodB() throws IOException {
        throw new IOException();
    }
}
