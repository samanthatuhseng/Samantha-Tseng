import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void writeString(String word, String fileName) throws IOException {
        byte[] wordBytes = word.getBytes();
        FileOutputStream out = new FileOutputStream(fileName);
        out.write(wordBytes);
    }

    public static void main(String[] args) throws IOException {

        char c = (char)97;
        String name = "samantha";
        byte[] stringbytes = name.getBytes();

        FileInputStream in = new FileInputStream("in.text");
        FileOutputStream out = new FileOutputStream("out.text");

        writeString("Hello there","Another.txt");

    }
}
