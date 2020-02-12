import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("tam.txt");
            BufferedWriter buffer = new BufferedWriter(file);
            buffer.write("hello");
            buffer.newLine();
            buffer.write("sobaka");
            buffer.close();

        }
        catch (IOException e) {
            System.out.println("error");
        }

    }

}
