import java.util.Scanner;

public class EsCicli7 {

	public static void main(String[] args) {
		
		// calcola fattoriale del numero inserito da tastiera 
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserisci un numero : ");
		System.out.println("------------");
		int i = scanner.nextInt();
		
		int fatt = 1;
		
		while(i>1) {
			
			
			
			fatt *= i;
			i--;
			
		}
		
		System.out.print("Il fattoriale è: ");
		System.out.println(fatt);
		
		
		
		
		
		
		
		
		
		
		
		scanner.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}
