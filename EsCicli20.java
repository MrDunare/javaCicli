import java.util.Scanner;

public class EsCicli20 {

	public static void main(String[] args) {
		
	/*
	 * esercizio
	 * 
	 * cercaLettera 
	 * 
	 * in ingresso una lettera ed un char
	 * 
	 * stampa se esiste quel char
	 * 
	 * 
	 * gattino y ----> no
	 * gattino t ----> si
	 * 
	 * 
	 * 
	 * 
	 */
	
		Scanner key = new Scanner(System.in);
		
		System.out.println("Inserisci una stringa");
		
		String parola = key.next();
		
		System.out.println("Inserisci un carattere");
		
		char carattere = key.next().charAt(0);
		
		int i = 0;
		
		boolean verita = false;
		
		while (i < parola.length()) {
			
			if(parola.charAt(i) == carattere) {
				
				verita=true;
				break;
			}
			
			
			i++;
		}
		
		
		if(verita) {
			System.out.println("si");
		}
		else
			System.out.println("no");
		
		
		
		
			
		key.close();
			
			
			
			
			
		
		
		
		
		
	}

}
