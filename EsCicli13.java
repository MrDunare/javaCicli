import java.util.Scanner;

public class EsCicli13 {

	public static void main(String[] args) {
		
		/*
		 * Data una stringa con scanner 
		 * il programma torna il numero di lettere a nella stringa
		 * 
		 * es casa -----> 2 
		 * 
		 * 
		 * nota : un ciclo che va da 0 a lunghezza della stringa(.length) 
		 * 
		 * all interno del ciclo dobbiamo estrarre la lettera corrente con charAt e capire
		 * se è una lettera a 
		 * 
		 * fuori dal ciclo stampo il contatore
		 * 
		 * 
		 */
		
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Inserisci una stringa: ");
		System.out.println("------------");
		
		String frase = key.next();
		
		int i = 0;
		int cont = 0;
		
		while(i < frase.length()) {
			
			if(frase.charAt(i) == 'a') {
				cont++;
			}
			
			i++;
		}
		System.out.println("-----------");
		System.out.println("ci sono " + cont + " lettere a");
		
		
		
		
		key.close();
		

	}

}
