import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadString {
    public static void main(String[] args) {
        System.out.println("enter name of book:");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(isr);
        String input =" ";
        try {
            input = buffer.readLine();
            buffer.close();
        } catch (IOException e) {
            System.out.println("Error of enter");
        }
        System.out.println("\nСпасибо, вы читаете" + " " + input);
    }
}
