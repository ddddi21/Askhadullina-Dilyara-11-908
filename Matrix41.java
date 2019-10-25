import java.util.Scanner;

public class Matrix41 {
    public static void main(String[] args) {
        System.out.println("Enter M:");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        System.out.println("Enter N:");
        int n = sc.nextInt();
        int [][] mas = new int [m][n];
        int [] mas_num = new int[n];
        int max_num = -1;
        int st = 0;
        for (int i = 0; i < n ; i++) {
            mas_num[i] = 0;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mas[i][j] = (int) (Math.random() * 100);
                System.out.printf("%3d",mas[i][j]);
            }
            System.out.println();
        }
        System.out.println("");
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m;j++) {
                for (int k = 0; k < m ; k++) {
                    if ((mas[j][i] == mas[k][i])&(k>j))
                        mas_num[i]++;
                }
            }
        }
        for (int i = 0; i < n ; i++) {
            if (mas_num[i] > max_num) {
                max_num = mas_num[i];
                st = i;
            }
        }
        if (max_num == -1) {
            System.out.println("Нет одинаковых элементов в столбцах");
        }
        else System.out.println("Столбец:" + st);
    }
}