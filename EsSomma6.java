
public class EsSomma6 {

	public static void main(String[] args) {
		
		//stampa produttoria da 4 a 8 ----> 4 * 5 * 6 * 7 * 8 

		
		int i = 4;
		int prod = 1;
		
		while ( i <=8 ) {
			
			prod *= i;
			i++;
		}
		
		System.out.println(prod);
			
		
	}

}
