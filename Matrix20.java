import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

class Matrix20 {
	public static void main(String[] args) {
		System.out.println("Enter M:");
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		System.out.println("Enter N:");
		int n = sc.nextInt();
		int p = 1;
		int [][] mas = new int [m][n];
		for (int i = 0; i<m; i++) {
			for (int j = 0; j<n; j++) {
				mas [i][j] = (int) (Math.random() * 100);
				System.out.printf("%4d", mas[i][j]);
			}
			System.out.println();
		}
		for (int i = 0; i<m; i++) {
			for (int j = 0; j<n; j++) {
				p*=mas[i][j];
			}
			System.out.println("Произведение " + i + "_"  + "строки:" + p);
			p = 1;
		}
		
	}
	
}