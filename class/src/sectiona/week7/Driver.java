package sectiona.week7;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.StandardOpenOption.APPEND;

public class Driver {
    public static void main(String[] args) throws IOException {
        try (PrintWriter out = new PrintWriter(Files.newOutputStream(Path.of("diary.txt")))) {
            out.println("Jan. 24, 2023");
            out.println("In the midst of a captivating lecture");
            out.println("Instructor won't let us leave.");
        }
    }

    public static void main4(String[] args) {
        try (DataInputStream din = new DataInputStream(Files.newInputStream(Path.of("sec011.bin")))) {
            System.out.println(din.readInt());
            System.out.println(din.readInt());
            System.out.println(din.readInt());
            System.out.println(din.readDouble());
            System.out.println(din.readInt());
            System.out.println(din.readInt());
            System.out.println(din.readInt());
            System.out.println(din.readDouble());
            System.out.println(din.readDouble());
            System.out.println(din.readDouble());
            System.out.println(din.readDouble());
            System.out.println(din.readDouble());
            System.out.println(din.readDouble());
            System.out.println(din.readDouble());
        } catch (IOException e) {
            //System.err.println();
            e.printStackTrace();
        }
    }

    public static void main3(String[] args) {
        try (DataOutputStream dout = new DataOutputStream(Files.newOutputStream(Path.of("sec011.bin"), APPEND))) {
            dout.writeInt(8);
            dout.writeInt(9);
            dout.writeInt(8);
            dout.writeDouble(3.1);
        } catch (IOException e) {
            System.err.println("Error writing the file");
        }
    }

    public static void main2(String[] args) {
        try {
            writeByte(Path.of("stuff.bin"), 42);
            writeByte(Path.of("stuff.bin"), 43);
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
