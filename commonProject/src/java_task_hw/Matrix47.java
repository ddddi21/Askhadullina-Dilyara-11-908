import java.util.Scanner;

public class Matrix47 {
    public static void main(String[] args) {
    System.out.println("Enter M:");
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    System.out.println("Enter N:");
    int n = sc.nextInt();
    System.out.println("Enter K1:");
    int k1 = sc.nextInt();
    System.out.println("Enter K2:");
    int k2 = sc.nextInt();
    int [] mas_k1 = new int [n];
    int [] mas_k2 = new int[n];
    int [][] mas  = new int[m][n];
        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n; j++) {
                mas[i][j] = (int) (Math.random() * 100);
                System.out.printf("%3d", mas[i][j]);
            }
            System.out.println();
        }
            for (int j = 0; j < n; j++) {
                mas_k1 [j]= mas[k1][j];
                mas_k2 [j] = mas[k2][j];
            }

            for (int j = 0; j < n ; j++) {
                mas[k1][j] =  mas_k2 [j];
                mas[k2][j] = mas_k1[j];
            }
        System.out.printf("");
        System.out.println();
        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n ; j++) {
                System.out.printf("%3d", mas[i][j]);
            }
            System.out.println();
        }
    }
}