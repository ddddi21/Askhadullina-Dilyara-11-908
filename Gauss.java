import java.util.Scanner;

class Gauss{
    public static void main(String[] args) {

        /* Ввод данных */

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        double[][] A = new double[100][100];
        double[] b = new double[100];
        for (int i = 0; i < n; i++) {
            A[i] = new double[100];
            for (int j = 0; j < m; j++) {
                A[i][j] = s.nextDouble();
            }
            b[i] = s.nextDouble();
        }

        /* Метод Гаусса */

        int N  = n;
        for (int p = 0; p < N; p++) {

            int max = p;
            for (int i = p + 1; i < N; i++) {
                if (Math.abs(A[i][p]) > Math.abs(A[max][p])) {
                    max = i;
                }
            }
            double[] temp = A[p]; A[p] = A[max]; A[max] = temp;
            double   t    = b[p]; b[p] = b[max]; b[max] = t;

            if (Math.abs(A[p][p]) <= 1e-10) {
                System.out.println("NO");
                return;
            }

            for (int i = p + 1; i < N; i++) {
                double alpha = A[i][p] / A[p][p];
                b[i] -= alpha * b[p];
                for (int j = p; j < N; j++) {
                    A[i][j] -= alpha * A[p][j];
                }
            }
        }

        // Обратный проход

        double[] x = new double[N];
        for (int i = N - 1; i >= 0; i--) {
            double sum = 0.0;
            for (int j = i + 1; j < N; j++) {
                sum += A[i][j] * x[j];
            }
            x[i] = (b[i] - sum) / A[i][i];
        }

        /* Вывод результатов */

        if (n < m) {
            System.out.print("INF");
        } else {
            System.out.println("YES");
            for (int i = 0; i < N; i++) {
                System.out.print(x[i] + " ");
            }
        }

    }
}
//Формат входных данных:
//В первой строке задаются два числа: количество уравнений n (n≥1) и количество неизвестных m (m≥1).
//Далее идут n строк, каждая из которых содержит m+1 число. Первые m чисел — это коэффициенты i-го уравнения системы,
//а последнее, (m+1)-е число — коэффициент bi, стоящий в правой части i-го уравнения. То есть для тестового примера следует вводить:
//4,4(4 уравнения и 4 неизвестных);3,2,1,1(первая строка матрицы А);-2(первый элемент из столбца свободных членов) и тд
//Формат выходных данных:
//В первой строке выводит слово YES, если решение существует и единственно, слово NO в случае, если решение не существует,
//и слово INF в случае, когда решений существует бесконечно много. Если решение существует и единственно,
//то во второй строке выводит решение системы в виде m чисел, разделенных пробелом.