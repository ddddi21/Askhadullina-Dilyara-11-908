class OddEvenSum {
	public static void main ( String[] args) {
		int sumOdd = 0;
		int sumEven = 0;
		int lowerbound = 1, upperbound = 1000;
		int absDiff;
		//short a = 0b100101; // 0b - обозначение того, что дальше двоич с.о.
		//int dec = 2134;
		//int oct = 02134; //0 - обозначение того, что восьмерич с.о.
		//byte b1= 1 , b2 = 3;
		//byte b3 = (byte) b1 + (byte) b2;
		//int  hex = 0x123; //0x - 16теричная с.о.
		int number = lowerbound;
		
		// while (number <= upperbound) {
			// if (number % 2 ==1) {
				// sumOdd += number;
			// } else {
				// sumEven += number;
			// }
			// number++; //number=number+1;
			//++number (?);
		// }
		
		do (
			if (number % 2 ==1) {
				sumOdd += number;
			} else {
				sumEven += number;
			}
			number++;
		) while (number < upperbound);
		
		for ( int number = 0; number < upperbound;
		number++) {
			
		}
		
		
		if (sumOdd > sumEven) {
			absDiff = sumOdd - sumEven;
		} else {
			absDiff = sumEven - sumOdd;
		}
	System.out.println ("Sum nechetnyh = " + sumOdd);
	System.out.println ("Sum chetnyh = " + sumEven);
	System.out.println ( "Raznica - " + absDiff);


	// int m =1;
	// switch (m) {
		// case 1;
			// System.out.println ("Январь");
			// break;
		// case 2;
			// System.out.println("Feb");
			// break;
		// default :
			// System.out.println ("неправильный формат месяца");
		
	// }

	}
}