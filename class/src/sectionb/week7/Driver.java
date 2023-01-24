package sectionb.week7;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.APPEND;

public class Driver {
    public static void main(String[] args) {
        try (Scanner din = new Scanner(
                Files.newInputStream(Path.of("sec021.txt")))) {
            System.out.println(din.next());
            System.out.println(din.nextInt());
        } catch(EOFException e) {
            System.err.println("Ran out of stuff");
        } catch(IOException e) {
            System.err.println("Bad stuff");
        }
    }
    public static void main3(String[] args) throws IOException {
        try (DataOutputStream dout = new DataOutputStream(
                Files.newOutputStream(Path.of("sec021.bin"), APPEND))) {
            dout.writeBoolean(false);
            dout.writeDouble(6);
            dout.writeDouble(4.2);
            dout.writeChar('M');
            dout.writeChar('S');
            dout.writeChar('O');
            dout.writeChar('E');
        }
    }

    public static void main2(String[] args) {
        try {
            writeByte(Path.of("stuff.bin"), 72);
        } catch (IOException e) {
            System.err.println("Bad stuff happened, maybe");
        }
        System.out.println("I'm done");
    }

    public static void writeByte(Path path, int data) throws IOException {
        try (OutputStream out = Files.newOutputStream(path)) {
            out.write(data);
        }
    }

    public static byte readByte(Path path) throws IOException {
        try (InputStream in = Files.newInputStream(path)) {
            return (byte)in.read();
        }
    }
}
