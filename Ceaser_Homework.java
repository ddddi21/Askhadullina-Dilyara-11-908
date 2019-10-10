import java.util.Scanner;
class Ceaser_Homework {
	public static void main (String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the line:");
		String str = a.next();
		System.out.println("Enter the shift:");
		int n= a.nextInt();
		String str2 = "";
		int b = 0;
		int d;
		final int UPPER_BOUND_UP = (int)'A';
		final int UPPER_BOUND_LOW = (int)'Z';
		final int DOWN_BOUND_UP = (int)'a';
		final int DOWN_BOUND_LOW = (int)'z';
		for (int i = 0; i <= str.length() - 1; i++){
			b= (int)str.charAt(i);
			if ((b>= UPPER_BOUND_UP) && (b<= UPPER_BOUND_LOW)){
					b+= n;
					while(b> UPPER_BOUND_LOW){
					d= b- UPPER_BOUND_LOW - 1;
					b= UPPER_BOUND_UP + d;
				}
			} else if ((b>= DOWN_BOUND_UP) && (b<= DOWN_BOUND_LOW)){
				b+= n;
				while ( b>= DOWN_BOUND_LOW){
				d= b- DOWN_BOUND_LOW - 1;
				b= DOWN_BOUND_UP + d;
				}
			}
			str2 += (char)b;
		}
		System.out.println(str2);
	}
	
}