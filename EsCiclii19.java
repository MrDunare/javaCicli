import java.util.Scanner;

public class EsCiclii19 {

	public static void main(String[] args) {
		
		/*
		 * es uomo prmitivo
		 * 
		 * data una stringa da input , dire se la stringa contiene tutte vocali 
		 * 
		 * 
		 * 
		 */
		Scanner key = new Scanner(System.in);
		
		System.out.println("Inserisci una stringa : ");
		
		String parString = key.next();
		
		
		int i = 0 ;
		
		boolean sonoTutteVocali = true;
		
		
		//   uuuuuuuuu
		//   sonotutteVocali = true;
		
		while(i < parString.length()) {
			
			
			 char carattereCorrente = parString.charAt(i);
			 
			 //  u != u && u != e
			 //   F && T ------------> F
			 
			 //  z != u &&  z != e  .. . . . t && t  .. . .. ..
			 
			 if(  carattereCorrente != 'u' && carattereCorrente != 'e' && carattereCorrente !='i' &&
					 carattereCorrente != 'o'  && carattereCorrente != 'a') {
				 
				 sonoTutteVocali = false;
			 }
			
			
			
			i++;
		}
		
		
		
		
		if(sonoTutteVocali )
			System.out.println("tu essere uomo primitivo");
		else
			System.out.println("ok tu essere uomo che conosce lettera!");
		
		
		key.close();

	}

}
