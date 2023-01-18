package sectionc.week7;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Driver {
    public static void main(String[] args) {
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
