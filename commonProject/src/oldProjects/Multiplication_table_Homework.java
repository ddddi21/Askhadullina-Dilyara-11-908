import java.util.Scanner;
class Multiplication_table_Homework {
	public static void main (String[] args) {
		Scanner x = new Scanner (System.in);
		int n = x.nextInt();
		for ( int i = 1; i<=n; i++) {
			for ( int j = 1; j<=n; j++){
				System.out.printf("%5d", (i)*(j));
			}
			System.out.println();
		}
	}
	
	
}