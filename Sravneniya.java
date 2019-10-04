class Sravneniya {
	public static void main ( String[] args) {
		String txt = "Fantastic";
		String lang = "Java";
		boolean state = ( txt == lang); // присваиваем результат проверки
		System.out.println ("Проверка строк на равенство: " + state) ; 
		state = ( txt != lang) ; //присваиваем результат
		System.out.println ( "Проверка строк на неравенство: " +state) ;
		int d = 12;
		int sc = 20;
		state = ( d > sc );
		System.out. println (" Проверка на больше: " + state);
		state = ( d < sc );
		System.out.println ("Проверка на меньшее: " + state);
		}
}