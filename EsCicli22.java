import java.util.Scanner;

public class EsCicli22 {
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Inserisci una stringa:  ");
		
		String parola = key.next();
			
		
		
		char prima = parola.charAt(0);
		char ultima = parola.charAt(parola.length()-1);
		
	
			
		if(prima == ultima)
			System.out.println("ok");
		else
			System.out.println("no");
			
			
		
		
		key.close();
		
		
	}
}
