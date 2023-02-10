package sectionc.week9;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) throws IOException {
        System.out.println(Files.lines(Path.of("beeTest.txt"))
                .map(line -> line.split("\\s+"))
                .mapToInt(words -> (int)Arrays.stream(words)
                        .map(word -> word.replaceAll("\\W+", ""))
                        .filter(word -> figuredItOut(word))
                        .count())
                .sum());
    }

    private static boolean figuredItOut(String word) {
        return word.equalsIgnoreCase("bee")
                || word.equalsIgnoreCase("honeybee")
                || word.equalsIgnoreCase("honeybees")
                        || word.equalsIgnoreCase("bees");
    }

    public static void main3(String[] args) {
        try (DataInputStream in = new DataInputStream(Files.newInputStream(Path.of("katie.bin")));
             PrintWriter out = new PrintWriter(Files.newOutputStream(Path.of("great.txt")))) {
            double value = -1;
            do {
                value = in.readDouble();
                if(value<0) {
                    out.println(value);
                }
            } while(value<0);
        } catch(IOException e) {
            System.out.println("You better check that file, things didn't go as planned.");
        }
    }
    public static void main2(String[] args) {
        try (DataOutputStream out = new DataOutputStream(Files.newOutputStream(Path.of("katie.bin")))) {
            double value;
            Scanner in = new Scanner(System.in);
            System.out.println("Enter negative numbers until you are tired");
            do {
                value = in.nextDouble();
                out.writeDouble(value);
            } while(value<0);
        } catch(IOException e) {
            System.out.println("You better check that file, things didn't go as planned.");
        }
    }
}
