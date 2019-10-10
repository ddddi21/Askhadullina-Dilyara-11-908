import java.util.Scanner;
class pi_Homework {
	public static void main (String[] args) {
		Scanner x = new Scanner (System.in);
		int n = x.nextInt();
		double pi = 0;
		int s = 0;
		for ( int i = 1; i <=n; i+=2) {
			if (s%2==0) {
				pi+= 1.0/i;
				s++;
			} else {
				pi-=1.0/i;
				s++;
			}
		}
		pi*=4;
		System.out.println("pi1=" + pi);
		if (pi>Math.PI) {
			System.out.println("абсолютная разность:" + (pi - Math.PI));
		}else {
			System.out.println("абсолютная разность:" + (Math.PI - pi));
		}
		
	}
	
	
}