package sectionc.week7;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.StandardOpenOption.APPEND;

public class Driver {

    public static void main(String[] args) throws IOException {
        try (PrintWriter out = new PrintWriter(Files.newOutputStream(Path.of("thing.txt")))) {
            out.print("""
                            Demonstration Picture
                            800 600
                            #F0F0F0
                            P: 40 40 #000000
                            C: 40 40 #FF0000 30
                            T: 60 60 #00FF00 100 50
                            R: 160 160 #0000FF 50 150
                            LT: 360 360 #00FF00 100 50 Tri
                            LR: 460 460 #0000FF 150 100 Reck Tangle Angle Rangle""");
        }
    }

    public static void main2(String[] args) {
        try {
            writeByte(Path.of("stuff.bin"), 72);
        } catch (IOException e) {
            System.err.println("Bad stuff happened, maybe");
            e.printStackTrace();
        }
        System.out.println("I'm done");
    }

    public static void writeByte(Path path, int data) throws IOException {
        try (OutputStream out = Files.newOutputStream(path, APPEND)) {
            out.write(data);
        }
    }

    public static byte readByte(Path path) throws IOException {
        try (InputStream in = Files.newInputStream(path)) {
            return (byte)in.read();
        }
    }
}
