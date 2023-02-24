import java.util.Scanner;

public class EsCicli23 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Inserisci una stringa:  ");
		
		String parola = key.next();
			
		int i = 0;
		
		while(i > parola.length() -1) {
			
			i--;
				
			
		}
		
		System.out.println(i);
		
		
		
		
		key.close();

	}

}
