import java.util.Scanner;

public class Matrix_Homework {
    public static int[][] enter_mass(int m, int n) {
        int [][] mas = new int [m][n];
        for (int i = 0; i<m; i++) {
            for (int j = 0; j<n; j++) {
                mas [i][j] = (int) (Math.random() * 7);
                System.out.printf("%4d", mas[i][j]);
            }
            System.out.println();
        }
        return mas;
    }
    public static void matrix20(int [][] mas){
        int p = 1;
        for (int i = 0; i<mas[0].length; i++) {
            for (int j = 0; j<mas.length; j++) {
                p*=mas[j][i];
            }
            System.out.println("Произведение " + i + " "  + "столбцов:" + p);
            p = 1;
        }
    }

    public static void matrix17(int [][] mas, int k){
        int s = 0;
        int p = 1;
        System.out.println();

        for (int j = 0; j<mas[0].length; j++) {
            s+=mas[k][j];
            p*=mas[k][j];
        }

        System.out.println("сумма = " + s);
        System.out.println("произведение = " + p);
    }

    public static void matrix27 (int [][] mas) {
        int min = Integer.MAX_VALUE;
        int min_max = Integer.MIN_VALUE;
        for (int i = 0; i <mas.length; i++) {
            for (int j = 0; j < mas[0].length; j++) {
                if (mas[i][j] < min) {
                    min = mas[i][j];
                }
            }
            if (min > min_max) {
                min_max = min;
            }
            min = Integer.MAX_VALUE;
        }
        System.out.println("максимальный среди минимальных:"+ min_max);
    }

    public static void matrix47(int [][] mas, int k, int k2) {
        int [] mas_k = mas [k];
        int [] mas_k2 = mas[k2];
        mas[k] = mas_k2;
        mas[k2] = mas_k;
        System.out.println();
        for (int i = 0; i < mas.length ; i++) {
            for (int j = 0; j < mas[0].length ; j++) {
                System.out.printf("%3d", mas[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

     public static void matrix61(int [][] mas, int k) {
         for (int i = 0; i < mas.length; i++) {
             if (i == k) continue;
             for (int j = 0; j < mas[0].length; j++) {
                     System.out.printf("%3d", mas[i][j]);
             }
             System.out.println();
         }
         System.out.println();
    }

    public static void matrix88(int[][] mas) {
        for (int i = 0; i < mas.length ; i++) {
            for (int j = 0; j < mas[0].length ; j++) {
                if (j < i) {
                    mas[i][j] = 0;
                }
            }
            }
            for (int i = 0; i < mas.length ; i++) {
                for (int j = 0; j < mas[0].length ; j++) {
                    System.out.printf("%3d", mas[i][j]);
                }
                System.out.println();
            }

    }
    public static void matrix41(int[][]mas) {
        int [] mas_num = new int[mas[0].length];
        int max_num = 0;

        int st = 0;
        for (int i = 0; i < mas[0].length; i++) {
            mas_num[i] = 0;
        }
        System.out.println("");
        int localValue = 1;
        for (int i = 0; i < mas[0].length ; i++) {
            for (int j = 0; j < mas.length;j++) {
                for (int k = 0; k < mas.length; k++) {
                    if ((mas[j][i] == mas[k][i]) & (k>=j)) {
                        localValue++;
                    }
                }
                if (localValue > mas_num[i]) {
                    mas_num[i] = localValue;
                }
                localValue = 1;
            }

        }
        for (int i = 0; i < mas[0].length; i++) {
            if (mas_num[i] > max_num) {
                max_num = mas_num[i];
                st = i;
            }
        }
        if (max_num == 0)
            System.out.println("Нет одинаковых элементов в столбцах");

        else System.out.println("Столбец:" + st);
    }


    public static void main(String [] args) {
        System.out.println("Enter M:");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        System.out.println("Enter N:");
        int n = sc.nextInt();
        System.out.println("Enter K:");
        int k = sc.nextInt()-1;
        System.out.println("Enter K2:");
        int k2 = sc.nextInt()-1;
        int [][] mas = new int [m][n];
        mas = enter_mass(m,n);
        matrix41(mas);
        matrix20(mas);
        matrix17(mas,k);
        matrix27(mas);
        matrix47(mas,k,k2);
        matrix61(mas,k);
        matrix88(mas);



    }
}
