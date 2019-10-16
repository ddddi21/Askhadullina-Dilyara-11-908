import java.util.Scanner;
class Matrix17 {
	public static void main (String[] args) {
		System.out.println("Enter M:");
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		System.out.println("Enter N:");
		int n = sc.nextInt();
		System.out.println("Enter K:");
		int k = sc.nextInt()-1;
		int s = 0;
		int p = 1;
		int[][] mas = new int[m][n];
		for (int i = 0;i<m;i++) {
			for (int j=0; j<n;j++) {
				mas[i][j]= sc.nextInt();
			}
		}
		
			for (int j = 0; j<n; j++) {
				s+=mas[k][j];
				p*=mas[k][j];
			}
		
		System.out.println("сумма = " + s);
		System.out.println("произведение = " + p);
	}
	
}