import java.util.*;

public class Exeptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n= Integer.parseInt(sc.next());
            System.out.println("you entered" + n);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("need a int");
        }
        catch (NumberFormatException e) {
            System.out.println("not right format of argument");
        }
        finally {
            System.out.println("program is over");
        }


    }
}
