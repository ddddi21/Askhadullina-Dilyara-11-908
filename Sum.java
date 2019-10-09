import java.util.Scanner;
class Sum {
	public static void main (String[] args) {
		Scanner ch = new Scanner (System.in);
		int s = 0;
		int a = ch.nextInt ();
		for ( int i = 1; i<=a; i++) {
			s+=i;
		}
		System.out.println(s);
		
	}
	
	
}