import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ff {
    public static void main(String[] args) {
        // "C:\\Users\\Администратор\\Documents\\NetBeansProjects\\JavaLessonsProject\\image.jpg"
        Scanner sc = new Scanner(System.in);
        Pattern p = Pattern.compile("(\\w+)\\.(jpg|bmp|png)");
        Matcher m = p.matcher(sc.nextLine());
        if (m.find()) {
            System.out.println(m.group(1) + " " + m.group(2));
        } else {
            System.out.println("Not found!");
        }
    }
}