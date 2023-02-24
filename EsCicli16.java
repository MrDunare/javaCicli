import java.util.Scanner;

public class EsCicli16 {

	public static void main(String[] args) {
		
		
		/*
		 * programma che prende una stringa e stampi solo le posizioni pari della stringa
		 * 
		 * es : albero ----> a b r 
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Inserisci una stringa:  ");
		
		String parola = key.next();
		
		int i = 0;
		
		while(i < parola.length()) {
			
			if(i % 2 == 0) 
				
				System.out.println("Le lettere pari  ---> " + parola.charAt(i));
				
			i++;
		}
		
			
		key.close();

	}

}
