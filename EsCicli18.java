import java.util.Scanner;

public class EsCicli18 {

	public static void main(String[] args) {
		/*
		 * es : creare un progr che prende in ingresso una stringa e stampi la meta della stringa 
		 * 
		 * es ciao -----> ci 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Inserisci una stringa : ");
		
		String parola = key.next();
		
		int indice = 0;
		
		while(indice < parola.length()/2) {
			
			System.out.print(parola.charAt(indice));
			System.out.print(" ");
			indice++;
			
		}
	
		key.close();
	}

}
