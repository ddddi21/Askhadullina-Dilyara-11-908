import java.util.Scanner;
class T_u {
	public static void main (String[] args) {
		Scanner x = new Scanner (System.in);
		int n = x.nextInt();
		for ( int i = 0; i<=n; i++) {
			for ( int j = 0; j<=n; j++){
				System.out.printf("%5d", (i+1)*(j+1));
			}
			System.out.println();
		}
	}
	
	
}