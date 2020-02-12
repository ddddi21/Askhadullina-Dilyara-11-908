import java.util.Arrays;
import java.util.Scanner;

public class Matrix27 {
    public static void main(String[] args) {
        System.out.println("Enter M:");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        System.out.println("Enter N:");
        int n = sc.nextInt();
        int[][] mas = new int[m][n];
        int min = Integer.MAX_VALUE;
        int min_max = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mas[i][j] = (int) (Math.random() * 100);
                System.out.printf("%3d" , mas[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mas[i][j] < min) {
                    min = mas[i][j];
                }
            }
            if (min > min_max) {
                min_max = min;
                min = Integer.MAX_VALUE;
            }
        }
        System.out.println(min_max);
    }
}
