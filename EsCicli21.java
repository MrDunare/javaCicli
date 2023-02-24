import java.util.Scanner;

public class EsCicli21 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Inserisci una stringa");
		
		String parola = key.next();
		
		int i = 0;
		
		int cont = 0;
		
		
		
		
		while(i<parola.length()) {
			
			if(parola.charAt(i) == 'a' || parola.charAt(i) == 'e' || parola.charAt(i) == 'i' || 
					parola.charAt(i) == 'o' || parola.charAt(i) == 'u') {
					
				cont++;
				
			if(cont>=2)
				break;
				
						
			}
			
			i++;
		}
		
		
		if(cont>=2)
			System.out.println("si");
		else
			System.out.println("no");
		
		
		
		key.close();
	}

}
