import java.util.Scanner;

public class EsCicli17 {

	public static void main(String[] args) {
		/*
		 * 
		 * creare una funzione con in ingresso un numero intero
		 * e una stringa, prosegue solo se il numero intero è compreso tra 0 e la lunghezza -1
		 * 
		 * il prgramma stamp a video o crea una variabile d'appoggio la stringa che 
		 * va dal numero fino alla fine della parola
		 * 
		 * 
		 * 
		 */
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Inserisci una stringa : ");
		
		String parola = key.next();
		
		System.out.println("Insersci un numero : ");
		
		int indice = key.nextInt();
		
		while(indice <= parola.length()-1) {
				
			System.out.print(parola.charAt(indice));
			
			indice++;
		}
		
		
		
		key.close();
		
	}

}
